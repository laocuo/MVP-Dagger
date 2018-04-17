package com.test.testapplication;

/**
 * Created by hoperun on 4/17/18.
 */

public class MainContract {
    public static interface View {
        void showText();
    }
    public static interface Presenter {
        void loadData();
    }
}
