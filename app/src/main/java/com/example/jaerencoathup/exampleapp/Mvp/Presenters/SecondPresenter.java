package com.example.jaerencoathup.exampleapp.Mvp.Presenters;

import com.example.jaerencoathup.exampleapp.Mvp.Second;

import javax.inject.Inject;
/**
 * Created by jaerencoathup on 15/04/2017.
 */

public class SecondPresenter extends PresenterTemplate<Second.View> implements Second.Presenter {

    Second.View view;

    int x = 1;

    @Inject
    public SecondPresenter(Second.View view) {
        this.view = view;
    }


    @Override
    public void onCreate() {

    }
 }
