package com.example.jaerencoathup.exampleapp.Dagger.Modules;

import com.example.jaerencoathup.exampleapp.Mvp.Third;
import com.example.jaerencoathup.exampleapp.Mvp.Presenters.ThirdPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Module
public class ThirdModule {

    Third.View view;

    public ThirdModule(Third.View view) {
        this.view = view;
    }

    @Provides
    public Third.View providesView() {
        return view;
    }

    @Provides
    public Third.Presenter providesPresenter(ThirdPresenter followersPresenter) {
        return followersPresenter;
    }
}
