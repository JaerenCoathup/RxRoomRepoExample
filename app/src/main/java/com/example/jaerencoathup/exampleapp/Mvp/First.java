package com.example.jaerencoathup.exampleapp.Mvp;

import com.example.jaerencoathup.exampleapp.Activities.Example;
import com.example.jaerencoathup.exampleapp.Persistence.WeatherData;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

public interface First {
    interface View extends Example.View{
        void showWeather(WeatherData weatherData);
    }

    interface Presenter extends Example.Presenter {
        void getWeather();
    }
}
