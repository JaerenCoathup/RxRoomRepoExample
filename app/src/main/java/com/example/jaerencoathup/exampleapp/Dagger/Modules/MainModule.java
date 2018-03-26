package com.example.jaerencoathup.exampleapp.Dagger.Modules;

import com.example.jaerencoathup.exampleapp.Mvp.Main;
import com.example.jaerencoathup.exampleapp.Mvp.Presenters.UserPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Module
public class MainModule {

    Main.View view;

    public MainModule(Main.View view) {
        this.view = view;
    }

    @Provides
    public Main.View providesView() {
        return view;
    }

    @Provides
    public Main.Presenter providesPresenter(UserPresenter mainPresenter) {
        return mainPresenter;
    }
}
