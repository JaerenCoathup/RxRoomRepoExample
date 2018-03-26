package com.example.jaerencoathup.exampleapp.Mvp.Presenters;

import com.example.jaerencoathup.exampleapp.Mvp.Followers;
import com.example.jaerencoathup.exampleapp.Networking.Repositories.IForecastRepository;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Created by jaerencoathup on 15/11/2017.
 */

public class FollowersPresenter extends PresenterTemplate<Followers.View> implements Followers.Presenter {

    Followers.View view;

    IForecastRepository userRepository;

    IFollowerRepository followerRepository;

    @Inject
    public FollowersPresenter(Followers.View view,
                              IForecastRepository userRepository,
                              IFollowerRepository followerRepository) {
        this.view = view;
        this.userRepository = userRepository;
        this.followerRepository = followerRepository;
    }

    @Override
    public void onCreate() {
        userRepository.getUser(this)
                .flatMap(user -> followerRepository.getFollowers(user.getLogin(), this))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(followers -> view.showFollowers(followers));
    }
}
