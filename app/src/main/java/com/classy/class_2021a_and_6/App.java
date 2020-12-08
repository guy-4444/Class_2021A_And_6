package com.classy.class_2021a_and_6;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MySignal.init(this);

    }

}
