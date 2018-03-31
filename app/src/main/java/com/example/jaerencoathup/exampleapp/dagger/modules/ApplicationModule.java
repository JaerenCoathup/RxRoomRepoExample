package com.example.jaerencoathup.exampleapp.dagger.modules;

import android.content.Context;

import com.example.jaerencoathup.exampleapp.ExampleApplication;
import com.example.jaerencoathup.exampleapp.session.SessionService;
import com.example.jaerencoathup.exampleapp.session.StorageSessionServiceImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 30/03/2018.
 */
@Module
public class ApplicationModule {

    @Provides
    public Context providesContext() {
        return ExampleApplication.getInstance();
    }

    @Provides
    public SessionService providesSessionService(StorageSessionServiceImpl sessionService) {
        return sessionService;
    }

}
