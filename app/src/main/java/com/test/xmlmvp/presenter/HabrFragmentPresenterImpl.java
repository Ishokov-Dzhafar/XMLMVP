package com.test.xmlmvp.presenter;

import com.test.xmlmvp.model.HabrFragmentInteractorImpl;
import com.test.xmlmvp.model.Interface.HabrFragmentInteractor;
import com.test.xmlmvp.model.response.Rss;
import com.test.xmlmvp.presenter.Interface.HabrFragmentPresenter;
import com.test.xmlmvp.view.Interface.HabrFragmentView;

/**
 * Created by dzhafar on 07.04.18.
 */

public class HabrFragmentPresenterImpl implements HabrFragmentPresenter {

    private HabrFragmentView view;
    private HabrFragmentInteractor interactor;

    public HabrFragmentPresenterImpl(HabrFragmentView view) {
        this.view = view;
        interactor = new HabrFragmentInteractorImpl(this);
        getHabrData();
    }


    @Override
    public void getHabrData() {
        interactor.getData();
    }

    @Override
    public void onSuccessRequest(Rss result) {
        view.onSuccessRequest(result);
    }

    @Override
    public void onFailedRequest(String message) {
        view.showError(message);
    }
}
