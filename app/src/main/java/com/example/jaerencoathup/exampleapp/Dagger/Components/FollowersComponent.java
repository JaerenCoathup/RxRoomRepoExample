package com.example.jaerencoathup.exampleapp.Dagger.Components;

import com.example.jaerencoathup.exampleapp.Dagger.Modules.WeatherRepositoryModule;
import com.example.jaerencoathup.exampleapp.Fragments.ThirdFragment;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.FollowersModule;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.FollowersRepositoryModule;

import dagger.Subcomponent;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Subcomponent(modules = {FollowersModule.class, WeatherRepositoryModule.class, FollowersRepositoryModule.class})
public interface FollowersComponent {
    void inject(ThirdFragment activity);
}
