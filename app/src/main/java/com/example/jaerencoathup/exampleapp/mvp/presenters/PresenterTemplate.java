package com.example.jaerencoathup.exampleapp.mvp.presenters;

import com.example.jaerencoathup.exampleapp.activities.Example;
import com.example.jaerencoathup.exampleapp.networking.ErrorHandler;

import io.reactivex.disposables.CompositeDisposable;
import retrofit2.Response;

/**
 * Created by jaerencoathup on 05/11/2017.
 */

public class PresenterTemplate<V extends Example.View> implements ErrorHandler {
    CompositeDisposable composites = new CompositeDisposable();

    V view;

    public void onStop() {
        composites.clear();
    }

    @Override
    public void onError(Response response) {
        view.showError();
    }
}
