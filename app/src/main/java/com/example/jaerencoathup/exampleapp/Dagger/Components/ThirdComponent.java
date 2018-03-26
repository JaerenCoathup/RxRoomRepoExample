package com.example.jaerencoathup.exampleapp.Dagger.Components;

import com.example.jaerencoathup.exampleapp.Dagger.Modules.WeatherRepositoryModule;
import com.example.jaerencoathup.exampleapp.Fragments.ThirdFragment;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.ThirdModule;

import dagger.Subcomponent;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Subcomponent(modules = {ThirdModule.class})
public interface ThirdComponent {
    void inject(ThirdFragment activity);
}
