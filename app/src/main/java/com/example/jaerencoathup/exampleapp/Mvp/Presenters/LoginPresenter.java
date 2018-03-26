package com.example.jaerencoathup.exampleapp.Mvp.Presenters;

import com.example.jaerencoathup.exampleapp.Mvp.Login;
import com.example.jaerencoathup.exampleapp.Networking.Repositories.IForecastRepository;

import javax.inject.Inject;

public class LoginPresenter extends PresenterTemplate<Login.View> implements Login.Presenter {

    IForecastRepository userRepository;

    @Inject
    public LoginPresenter(Login.View view, IForecastRepository userRepository) {
        this.view = view;
        this.userRepository = userRepository;
    }

    @Override
    public void login(String username) {
        userRepository.login(username, this)
                .subscribe(user -> view.showSuccess(),
                        throwable -> view.showError());
    }
}