package com.test.testapplication;

import javax.inject.Inject;

/**
 * Created by hoperun on 4/17/18.
 */

public class MainPresenter implements MainContract.Presenter{
    @Inject
    MainPresenter(MainContract.View view) {

    }

    @Override
    public void loadData() {

    }
}
