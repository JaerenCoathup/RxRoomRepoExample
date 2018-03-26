package com.example.jaerencoathup.exampleapp.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jaerencoathup.exampleapp.Dagger.Modules.MainModule;
import com.example.jaerencoathup.exampleapp.ExampleApplication;
import com.example.jaerencoathup.exampleapp.Mvp.Main;
import com.example.jaerencoathup.exampleapp.R;
import com.example.jaerencoathup.exampleapp.RealmObjects.User;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondFragment extends ExampleFragment<Main.Presenter> implements Main.View {

    @BindView(R.id.tv_id)
    TextView tvId;

    @BindView(R.id.tv_login)
    TextView tvLogin;

    @BindView(R.id.tv_location)
    TextView tvLocation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies();
        presenter.onCreate();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    private void injectDependencies() {
        ExampleApplication.getApplicationComponent()
                .plus(new MainModule(this))
                .inject(this);
    }

    public void onStop() {
        super.onStop();
    }

    @Override
    public void showUser(User user) {
        tvId.setText(user.getId() + "");
        tvLogin.setText(user.getLogin());
        tvLocation.setText(user.getLocation());
    }
}
