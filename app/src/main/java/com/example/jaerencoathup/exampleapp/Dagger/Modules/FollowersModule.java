package com.example.jaerencoathup.exampleapp.Dagger.Modules;

import com.example.jaerencoathup.exampleapp.Mvp.Followers;
import com.example.jaerencoathup.exampleapp.Mvp.Presenters.FollowersPresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Module
public class FollowersModule {

    Followers.View view;

    public FollowersModule(Followers.View view) {
        this.view = view;
    }

    @Provides
    public Followers.View providesView() {
        return view;
    }

    @Provides
    public Followers.Presenter providesPresenter(FollowersPresenter followersPresenter) {
        return followersPresenter;
    }
}
