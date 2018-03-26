package com.example.jaerencoathup.exampleapp.Dagger.Components;

import com.example.jaerencoathup.exampleapp.Dagger.Modules.MainModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.WeatherRepositoryModule;
import com.example.jaerencoathup.exampleapp.Fragments.SecondFragment;

import dagger.Subcomponent;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Subcomponent(modules = {MainModule.class, WeatherRepositoryModule.class})
public interface MainComponent {
    void inject(SecondFragment activity);
}
