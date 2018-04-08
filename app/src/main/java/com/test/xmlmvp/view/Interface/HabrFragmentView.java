package com.test.xmlmvp.view.Interface;

import com.test.xmlmvp.model.response.Rss;

/**
 * Created by dzhafar on 07.04.18.
 */

public interface HabrFragmentView {

    void onSuccessRequest(Rss result);
    void showError(String message);
}
