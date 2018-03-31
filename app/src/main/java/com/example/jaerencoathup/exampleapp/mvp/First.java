package com.example.jaerencoathup.exampleapp.mvp;

import com.example.jaerencoathup.exampleapp.activities.Example;
import com.example.jaerencoathup.exampleapp.persistence.ForecastEntity;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

public interface First {
    interface View extends Example.View{
        void showWeather(ForecastEntity weatherData);
    }

    interface Presenter extends Example.Presenter {
        void onBind();
    }
}
