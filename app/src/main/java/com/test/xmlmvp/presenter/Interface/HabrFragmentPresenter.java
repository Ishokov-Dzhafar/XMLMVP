package com.test.xmlmvp.presenter.Interface;

import com.test.xmlmvp.model.response.Rss;

/**
 * Created by dzhafar on 07.04.18.
 */

public interface HabrFragmentPresenter {

    void getHabrData();
    void onSuccessRequest(Rss result);
    void onFailedRequest(String message);
}
