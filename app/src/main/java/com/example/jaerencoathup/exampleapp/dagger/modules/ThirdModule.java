package com.example.jaerencoathup.exampleapp.dagger.modules;

import com.example.jaerencoathup.exampleapp.mvp.Second;
import com.example.jaerencoathup.exampleapp.mvp.presenters.SecondPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Module
public class ThirdModule {

    Second.View view;

    public ThirdModule(Second.View view) {
        this.view = view;
    }

    @Provides
    public Second.View providesView() {
        return view;
    }

    @Provides
    public Second.Presenter providesPresenter(SecondPresenter followersPresenter) {
        return followersPresenter;
    }
}
