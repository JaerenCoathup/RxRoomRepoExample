package com.example.jaerencoathup.exampleapp.Mvp.Presenters;

import com.example.jaerencoathup.exampleapp.Mvp.Third;

import javax.inject.Inject;


/**
 * Created by jaerencoathup on 15/11/2017.
 */

public class ThirdPresenter extends PresenterTemplate<Third.View> implements Third.Presenter {

    Third.View view;

    @Inject
    public ThirdPresenter(Third.View view) {
        this.view = view;
    }

    @Override
    public void onCreate() {

    }
}
