package com.example.jaerencoathup.exampleapp.Mvp.Presenters;

import com.example.jaerencoathup.exampleapp.Activities.Example;
import com.example.jaerencoathup.exampleapp.Networking.ErrorHandler;

import io.reactivex.disposables.CompositeDisposable;
import retrofit2.Response;

/**
 * Created by jaerencoathup on 05/11/2017.
 */

public class PresenterTemplate<V extends Example.View> implements ErrorHandler {
    CompositeDisposable composites = new CompositeDisposable();

    V view;

    public void onDestroy() {
        composites.clear();
    }

    @Override
    public void onError(Response response) {
        view.showError();
    }
}
