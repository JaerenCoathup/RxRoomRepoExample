package com.example.jaerencoathup.exampleapp;

import android.app.Application;

import com.example.jaerencoathup.exampleapp.dagger.components.ApplicationComponent;
import com.example.jaerencoathup.exampleapp.dagger.components.DaggerApplicationComponent;
import com.facebook.stetho.Stetho;

import net.danlew.android.joda.JodaTimeAndroid;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

public class ExampleApplication extends Application {

    private static ApplicationComponent applicationComponent;

    private static ExampleApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        injectDependencies();
        Stetho.initializeWithDefaults(this);
        JodaTimeAndroid.init(this);
        instance = this;
    }

    private void injectDependencies() {
        applicationComponent = DaggerApplicationComponent.builder().build();
        applicationComponent.inject(this);
    }

    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public static ExampleApplication getInstance() {
        return instance;
    }
}
