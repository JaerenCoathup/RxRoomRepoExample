package com.example.jaerencoathup.exampleapp.Dagger.Modules;

import com.example.jaerencoathup.exampleapp.Mvp.Login;
import com.example.jaerencoathup.exampleapp.Mvp.Presenters.LoginPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

@Module
public class LoginModule {

    Login.View view;

    public LoginModule(Login.View view) {
        this.view = view;
    }

    @Provides
    public Login.View providesView() {
        return view;
    }

    @Provides
    public Login.Presenter providesPresenter(LoginPresenter loginPresenter) {
        return loginPresenter;
    }
}
