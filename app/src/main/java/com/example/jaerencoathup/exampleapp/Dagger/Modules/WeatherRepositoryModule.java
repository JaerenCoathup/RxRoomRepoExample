package com.example.jaerencoathup.exampleapp.Dagger.Modules;

import com.example.jaerencoathup.exampleapp.Networking.Repositories.Forecast.WeatherRepository;
import com.example.jaerencoathup.exampleapp.Networking.Repositories.Forecast.WeatherRepositoryImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 03/11/2017.
 */

@Module
public class WeatherRepositoryModule {
    @Provides
    public WeatherRepository provideUserRepository(WeatherRepositoryImpl userRepository) {
        return userRepository;
    }
}
