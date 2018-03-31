package com.example.jaerencoathup.exampleapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jaerencoathup.exampleapp.dagger.modules.ThirdModule;
import com.example.jaerencoathup.exampleapp.ExampleApplication;
import com.example.jaerencoathup.exampleapp.mvp.Second;
import com.example.jaerencoathup.exampleapp.R;
import com.example.jaerencoathup.exampleapp.persistence.ForecastEntity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondFragment extends ExampleFragment<Second.Presenter> implements Second.View {

    @BindView(R.id.tv_wind_speed)
    TextView tvWindSpeed;

    @BindView(R.id.tv_wind_direction)
    TextView tvWindDirection;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies();
        presenter.onBind();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        ButterKnife.bind(this, view);
        presenter.onBind();
        return view;
    }

    private void injectDependencies() {
        ExampleApplication.getApplicationComponent().plus(new ThirdModule(this)).inject(this);
    }

    @Override
    public void showWind(ForecastEntity forecastEntity) {
        tvWindSpeed.setText(String.format(getString(R.string.wind_speed_format), forecastEntity.wind.speed));
        tvWindDirection.setText(String.format(getString(R.string.wind_direction_format), forecastEntity.wind.deg));
    }
}
