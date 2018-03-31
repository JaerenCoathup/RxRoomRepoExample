package com.example.jaerencoathup.exampleapp.dagger.components;

import com.example.jaerencoathup.exampleapp.fragments.FirstFragment;
import com.example.jaerencoathup.exampleapp.dagger.modules.FirstModule;

import dagger.Subcomponent;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Subcomponent(modules = {FirstModule.class})
public interface FirstComponent {
    void inject(FirstFragment activity);
}
