package com.example.jaerencoathup.exampleapp.dagger.modules;

import com.example.jaerencoathup.exampleapp.mvp.First;
import com.example.jaerencoathup.exampleapp.mvp.presenters.FirstPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Module
public class FirstModule {

    First.View view;

    public FirstModule(First.View view) {
        this.view = view;
    }

    @Provides
    public First.View providesView() {
        return view;
    }

    @Provides
    public First.Presenter providesPresenter(FirstPresenter presenter) {
        return presenter;
    }
}
