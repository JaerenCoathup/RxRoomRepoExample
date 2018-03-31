package com.example.jaerencoathup.exampleapp.dagger.components;

import com.example.jaerencoathup.exampleapp.dagger.modules.SecondModule;
import com.example.jaerencoathup.exampleapp.fragments.ThirdFragment;

import dagger.Subcomponent;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Subcomponent(modules = {SecondModule.class})
public interface SecondComponent {
    void inject(ThirdFragment activity);
}
