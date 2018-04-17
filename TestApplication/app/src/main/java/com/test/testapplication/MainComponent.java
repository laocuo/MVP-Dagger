package com.test.testapplication;

import dagger.Component;

/**
 * Created by hoperun on 4/17/18.
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
