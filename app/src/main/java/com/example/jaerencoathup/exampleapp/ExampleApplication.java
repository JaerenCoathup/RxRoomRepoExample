package com.example.jaerencoathup.exampleapp;

import android.app.Application;

import com.example.jaerencoathup.exampleapp.Dagger.Components.ApplicationComponent;
import com.example.jaerencoathup.exampleapp.Dagger.Components.DaggerApplicationComponent;
import com.facebook.stetho.Stetho;

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
