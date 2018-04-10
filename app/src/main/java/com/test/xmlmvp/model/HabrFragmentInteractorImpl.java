package com.test.xmlmvp.model;

import android.os.AsyncTask;
import android.util.Log;

import com.test.xmlmvp.model.Interface.HabrFragmentInteractor;
import com.test.xmlmvp.presenter.Interface.HabrFragmentPresenter;
import com.test.xmlmvp.model.response.Rss;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by dzhafar on 07.04.18.
 */

public class HabrFragmentInteractorImpl implements HabrFragmentInteractor {

    private HabrFragmentPresenter presenter;
    private HabrTask task;

    public HabrFragmentInteractorImpl(HabrFragmentPresenter presenter) {
        this.presenter = presenter;
        task = new HabrTask();
    }


    @Override
    public void getData() {
        if (task.getStatus() == AsyncTask.Status.PENDING || task.getStatus() == AsyncTask.Status.FINISHED) {
            task = new HabrTask();
            task.execute("https://habrahabr.ru/rss/hubs/all/");
        }

    }

    private class HabrTask extends AsyncTask<String, String, String> {

        static final String REQUEST_METHOD = "GET";
        static final String REQUEST_FAILED = "REQUEST FAILED";
        static final int READ_TIMEOUT = 15000;
        static final int CONNECTION_TIMEOUT = 15000;


        @Override
        protected String doInBackground(String... strings) {
            String stringUrl = strings[0];
            String result="";
            String inputLine;
            try {

                URL url = new URL(stringUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod(REQUEST_METHOD);
                conn.setReadTimeout(READ_TIMEOUT);
                conn.setConnectTimeout(CONNECTION_TIMEOUT);
                if (conn.getResponseCode() == HttpsURLConnection.HTTP_OK) {
                    try {
                        InputStreamReader in = new InputStreamReader(conn.getInputStream());
                        BufferedReader reader = new BufferedReader(in);
                        StringBuilder stringBuilder = new StringBuilder();
                        while ((inputLine = reader.readLine()) != null) {
                            stringBuilder.append(inputLine);
                        }
                        reader.close();
                        in.close();
                        result = stringBuilder.toString();
                    } finally {
                        conn.disconnect();
                    }
                } else {
                    result = REQUEST_FAILED; // See documentation for more info on response handling
                }
            } catch (IOException e) {
                //TODO Handle problems..
                result = REQUEST_FAILED;
            }
            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if (!s.equals(REQUEST_FAILED)) {
                Serializer serializer = new Persister();
                try {
                    Rss habrResopnse = serializer.read(Rss.class, s);
                    presenter.onSuccessRequest(habrResopnse);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                presenter.onFailedRequest(s);
            }
        }
    }
}
