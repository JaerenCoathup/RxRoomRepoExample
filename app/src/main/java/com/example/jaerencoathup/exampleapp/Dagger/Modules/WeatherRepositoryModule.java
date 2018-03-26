package com.example.jaerencoathup.exampleapp.Dagger.Modules;

import com.example.jaerencoathup.exampleapp.Networking.Interactors.Memory.WeatherMemoryInteractor;
import com.example.jaerencoathup.exampleapp.Networking.Interactors.Memory.WeatherMemoryInteractorImpl;
import com.example.jaerencoathup.exampleapp.Networking.Interactors.Network.WeatherNetworkInteractor;
import com.example.jaerencoathup.exampleapp.Networking.Interactors.Network.WeatherNetworkInteractorImpl;
import com.example.jaerencoathup.exampleapp.Networking.Repositories.Forecast.WeatherRepository;
import com.example.jaerencoathup.exampleapp.Networking.Repositories.Forecast.WeatherRepositoryImpl;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 03/11/2017.
 */

@Module
public class WeatherRepositoryModule {

    @Provides
    public WeatherNetworkInteractor provideWeatherNetwork(WeatherNetworkInteractorImpl networkInteractor) {
        return networkInteractor;
    }

    @Provides
    @Singleton
    public WeatherMemoryInteractor provideWeatherMemory() {
        return new WeatherMemoryInteractorImpl();
    }

    @Provides
    @Singleton
    public WeatherRepository provideWeatherRepository(WeatherNetworkInteractor networkInteractor, WeatherMemoryInteractor weatherMemoryInteractor) {
        return new WeatherRepositoryImpl(networkInteractor, weatherMemoryInteractor);
    }
}
