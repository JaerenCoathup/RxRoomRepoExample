package com.example.jaerencoathup.exampleapp.mvp;

import com.example.jaerencoathup.exampleapp.activities.Example;
import com.example.jaerencoathup.exampleapp.persistence.WeatherData;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

public interface Second {
    interface View extends Example.View{
        void showWind(WeatherData forecastEntity);
    }

    interface Presenter extends Example.Presenter {
        void onBind();
    }
}
