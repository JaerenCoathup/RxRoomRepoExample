package com.example.jaerencoathup.exampleapp.mvp.presenters;

import com.example.jaerencoathup.exampleapp.interactors.Network.WeatherNetworkInteractor;
import com.example.jaerencoathup.exampleapp.mvp.Third;
import com.example.jaerencoathup.exampleapp.repositories.weather.WeatherRepository;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

public class ThirdPresenter extends PresenterTemplate<Third.View> implements Third.Presenter {

    Third.View view;
    WeatherNetworkInteractor networkInteractor;
    WeatherRepository weatherRepository;

    int x = 1;

    @Inject
    public ThirdPresenter(Third.View view,
                          WeatherRepository weatherRepository,
                          WeatherNetworkInteractor networkInteractor) {
        this.view = view;
        this.weatherRepository = weatherRepository;
        this.networkInteractor = networkInteractor;
    }


    @Override
    public void onBind() {
        composites.add(weatherRepository.getForecastData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(view::showLocation));
    }

    @Override
    public void changeLocation(String name) {
        composites.add(networkInteractor.getWeatherData(name)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(data -> {}, error -> view.showError()));
    }
 }
