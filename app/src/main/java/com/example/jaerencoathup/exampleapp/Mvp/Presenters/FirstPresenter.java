package com.example.jaerencoathup.exampleapp.Mvp.Presenters;

import com.example.jaerencoathup.exampleapp.Mvp.First;
import com.example.jaerencoathup.exampleapp.Networking.Repositories.Forecast.WeatherRepository;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;

public class FirstPresenter extends PresenterTemplate<First.View> implements First.Presenter {

    WeatherRepository weatherRepository;

    @Inject
    public FirstPresenter(First.View view, WeatherRepository weatherRepository) {
        this.view = view;
        this.weatherRepository = weatherRepository;
    }

    @Override
    public void getWeather() {
        weatherRepository.getForecastData("London")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(view::showWeather);
    }
}