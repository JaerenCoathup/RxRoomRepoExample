package com.example.jaerencoathup.exampleapp.dagger.modules;

import com.example.jaerencoathup.exampleapp.interactors.Database.WeatherDatabaseInteractor;
import com.example.jaerencoathup.exampleapp.interactors.Database.WeatherDatabaseInteractorImpl;
import com.example.jaerencoathup.exampleapp.interactors.Memory.WeatherMemoryInteractor;
import com.example.jaerencoathup.exampleapp.interactors.Memory.WeatherMemoryInteractorImpl;
import com.example.jaerencoathup.exampleapp.interactors.Network.WeatherNetworkInteractor;
import com.example.jaerencoathup.exampleapp.interactors.Network.WeatherNetworkInteractorImpl;
import com.example.jaerencoathup.exampleapp.repositories.weather.WeatherRepository;
import com.example.jaerencoathup.exampleapp.repositories.weather.WeatherRepositoryImpl;
import com.example.jaerencoathup.exampleapp.session.SessionService;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 03/11/2017.
 */

@Module
public class WeatherRepositoryModule {

    @Provides
    @Singleton
    public WeatherNetworkInteractor provideWeatherNetwork(WeatherNetworkInteractorImpl networkInteractor) {
        return networkInteractor;
    }

    @Provides
    @Singleton
    public WeatherMemoryInteractor provideWeatherMemory(WeatherMemoryInteractorImpl memoryInteractor) {
        return memoryInteractor;
    }

    @Provides
    public WeatherDatabaseInteractor provideWeatherDatabase(WeatherDatabaseInteractorImpl databaseInteractor) {
        return databaseInteractor;
    }

    @Provides
    @Singleton
    public WeatherRepository provideWeatherRepository(SessionService sessionService,
                                                      WeatherNetworkInteractor networkInteractor,
                                                      WeatherDatabaseInteractor databaseInteractor,
                                                      WeatherMemoryInteractor weatherMemoryInteractor) {
        return new WeatherRepositoryImpl(sessionService, networkInteractor, databaseInteractor, weatherMemoryInteractor);
    }
}
