package com.example.jaerencoathup.exampleapp.Mvp.Presenters;

import com.example.jaerencoathup.exampleapp.Mvp.Main;
import com.example.jaerencoathup.exampleapp.Networking.Repositories.IForecastRepository;
import javax.inject.Inject;
/**
 * Created by jaerencoathup on 15/04/2017.
 */

public class UserPresenter extends PresenterTemplate<Main.View> implements Main.Presenter {

    Main.View view;

    IForecastRepository userRepository;

    int x = 1;

    @Inject
    public UserPresenter(Main.View view, IForecastRepository userRepository) {
        this.view = view;
        this.userRepository = userRepository;
    }


    @Override
    public void onCreate() {

    }
 }
