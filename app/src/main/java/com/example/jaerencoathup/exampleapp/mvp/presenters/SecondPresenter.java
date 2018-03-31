package com.example.jaerencoathup.exampleapp.mvp.presenters;

import com.example.jaerencoathup.exampleapp.mvp.Second;
import com.example.jaerencoathup.exampleapp.repositories.weather.WeatherRepository;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;


/**
 * Created by jaerencoathup on 15/11/2017.
 */

public class SecondPresenter extends PresenterTemplate<Second.View> implements Second.Presenter {

    Second.View view;
    WeatherRepository weatherRepository;

    @Inject
    public SecondPresenter(Second.View view, WeatherRepository weatherRepository) {
        this.view = view;
        this.weatherRepository = weatherRepository;
    }

    @Override
    public void onBind() {
        composites.add(weatherRepository.getForecastData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(view::showWind));
    }
}
