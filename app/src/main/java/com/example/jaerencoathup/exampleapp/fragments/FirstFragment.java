package com.example.jaerencoathup.exampleapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jaerencoathup.exampleapp.dagger.modules.FirstModule;
import com.example.jaerencoathup.exampleapp.ExampleApplication;
import com.example.jaerencoathup.exampleapp.mvp.First;
import com.example.jaerencoathup.exampleapp.persistence.WeatherData;
import com.example.jaerencoathup.exampleapp.R;
import com.example.jaerencoathup.exampleapp.utils.DateUtils;
import butterknife.BindView;
import butterknife.ButterKnife;

public class FirstFragment extends ExampleFragment<First.Presenter> implements First.View {

    @BindView(R.id.tv_day_name)
    TextView tvDayName;

    @BindView(R.id.tv_date)
    TextView tvDate;

    @BindView(R.id.tv_temp)
    TextView tvTemp;

    @BindView(R.id.tv_forecast)
    TextView tvForecast;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        ButterKnife.bind(this, view);
        presenter.onBind();
        return view;
    }

    private void injectDependencies() {
        ExampleApplication.getApplicationComponent().plus(new FirstModule(this)).inject(this);
    }

    @Override
    public void showWeather(WeatherData weatherData) {
        tvDayName.setText(DateUtils.weekdayToText(weatherData.dt.getDayOfWeek()));
        tvDate.setText(String.format(getString(R.string.date_format),
                weatherData.dt.getDayOfMonth(), DateUtils.monthToText(weatherData.dt.getMonthOfYear())));
        tvTemp.setText(String.format(getString(R.string.temp_format), weatherData.temp));
        tvForecast.setText(weatherData.weather.main);

    }
}
