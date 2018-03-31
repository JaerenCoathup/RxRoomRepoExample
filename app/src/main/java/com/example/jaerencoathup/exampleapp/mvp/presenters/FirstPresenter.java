package com.example.jaerencoathup.exampleapp.mvp.presenters;

import com.example.jaerencoathup.exampleapp.mvp.First;
import com.example.jaerencoathup.exampleapp.repositories.weather.WeatherRepository;

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
    public void onBind() {
        composites.add(weatherRepository.getForecastData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(view::showWeather));
    }
}