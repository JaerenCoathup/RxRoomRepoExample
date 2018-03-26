package com.example.jaerencoathup.exampleapp.Dagger.Components;

import com.example.jaerencoathup.exampleapp.Dagger.Modules.WeatherRepositoryModule;
import com.example.jaerencoathup.exampleapp.Fragments.FirstFragment;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.LoginModule;

import dagger.Subcomponent;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Subcomponent(modules = {LoginModule.class, WeatherRepositoryModule.class})
public interface LoginComponent {
    void inject(FirstFragment activity);
}
