package com.example.jaerencoathup.exampleapp.Dagger.Components;

import com.example.jaerencoathup.exampleapp.Dagger.Modules.DatabaseModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.SecondModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.ThirdModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.FirstModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.NetworkingModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.WeatherRepositoryModule;
import com.example.jaerencoathup.exampleapp.ExampleApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jaerencoathup on 05/05/2017.
 */
@Component(modules = {NetworkingModule.class,
        DatabaseModule.class,
        WeatherRepositoryModule.class})
@Singleton
public interface ApplicationComponent {
    void inject(ExampleApplication exampleApplication);
    SecondComponent plus(SecondModule module);
    FirstComponent plus(FirstModule module);
    ThirdComponent plus(ThirdModule module);
}
