package com.example.jaerencoathup.exampleapp.Dagger.Components;

import com.example.jaerencoathup.exampleapp.Dagger.Modules.SecondModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.WeatherRepositoryModule;
import com.example.jaerencoathup.exampleapp.Fragments.SecondFragment;

import dagger.Subcomponent;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Subcomponent(modules = {SecondModule.class})
public interface SecondComponent {
    void inject(SecondFragment activity);
}
