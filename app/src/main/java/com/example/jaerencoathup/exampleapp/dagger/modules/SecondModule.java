package com.example.jaerencoathup.exampleapp.dagger.modules;

import com.example.jaerencoathup.exampleapp.mvp.Third;
import com.example.jaerencoathup.exampleapp.mvp.presenters.ThirdPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Module
public class SecondModule {

    Third.View view;

    public SecondModule(Third.View view) {
        this.view = view;
    }

    @Provides
    public Third.View providesView() {
        return view;
    }

    @Provides
    public Third.Presenter providesPresenter(ThirdPresenter mainPresenter) {
        return mainPresenter;
    }
}
