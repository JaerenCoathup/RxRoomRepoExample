package com.example.jaerencoathup.exampleapp.dagger.components;

import com.example.jaerencoathup.exampleapp.fragments.SecondFragment;
import com.example.jaerencoathup.exampleapp.dagger.modules.ThirdModule;

import dagger.Subcomponent;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Subcomponent(modules = {ThirdModule.class})
public interface ThirdComponent {
    void inject(SecondFragment activity);
}
