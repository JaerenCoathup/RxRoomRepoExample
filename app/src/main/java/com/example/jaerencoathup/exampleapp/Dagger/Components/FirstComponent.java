package com.example.jaerencoathup.exampleapp.Dagger.Components;

import com.example.jaerencoathup.exampleapp.Fragments.FirstFragment;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.FirstModule;

import dagger.Subcomponent;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Subcomponent(modules = {FirstModule.class})
public interface FirstComponent {
    void inject(FirstFragment activity);
}
