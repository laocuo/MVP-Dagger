package com.test.testapplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hoperun on 4/17/18.
 */

@Module
public class MainModule {
    private MainContract.View mView;
    public MainModule(MainContract.View view) {
        mView = view;
    }

    @Provides
    MainContract.View provideMainView() {
        return mView;
    }

    @Provides
    MainBean provideMainBean() {
        return new MainBean();
    }
}
