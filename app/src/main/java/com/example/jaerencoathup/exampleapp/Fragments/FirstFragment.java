package com.example.jaerencoathup.exampleapp.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.jaerencoathup.exampleapp.Dagger.Modules.LoginModule;
import com.example.jaerencoathup.exampleapp.ExampleApplication;
import com.example.jaerencoathup.exampleapp.Mvp.Login;
import com.example.jaerencoathup.exampleapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FirstFragment extends ExampleFragment<Login.Presenter> implements Login.View {

    @BindView(R.id.et_username)
    EditText etUsername;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_login, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    private void injectDependencies() {
        ExampleApplication.getApplicationComponent().plus(new LoginModule(this)).inject(this);
    }

    @OnClick(R.id.btn_login)
    public void login() {
        presenter.login(etUsername.getText().toString());
    }

    @Override
    public void showSuccess() {
        showMessage("LOGGED IN!");
    }
}
