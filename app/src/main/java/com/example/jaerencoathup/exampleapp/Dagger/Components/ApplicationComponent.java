package com.example.jaerencoathup.exampleapp.Dagger.Components;

import com.example.jaerencoathup.exampleapp.Dagger.Modules.DatabaseModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.FollowersModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.LoginModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.MainModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.NetworkingModule;
import com.example.jaerencoathup.exampleapp.ExampleApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jaerencoathup on 05/05/2017.
 */
@Component(modules = {NetworkingModule.class, DatabaseModule.class})
@Singleton
public interface ApplicationComponent {
    void inject(ExampleApplication exampleApplication);
    MainComponent plus(MainModule module);
    LoginComponent plus(LoginModule module);
    FollowersComponent plus(FollowersModule module);
}
