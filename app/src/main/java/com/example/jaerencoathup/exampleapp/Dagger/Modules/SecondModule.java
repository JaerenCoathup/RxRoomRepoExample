package com.example.jaerencoathup.exampleapp.Dagger.Modules;

import com.example.jaerencoathup.exampleapp.Mvp.Second;
import com.example.jaerencoathup.exampleapp.Mvp.Presenters.SecondPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Module
public class SecondModule {

    Second.View view;

    public SecondModule(Second.View view) {
        this.view = view;
    }

    @Provides
    public Second.View providesView() {
        return view;
    }

    @Provides
    public Second.Presenter providesPresenter(SecondPresenter mainPresenter) {
        return mainPresenter;
    }
}
