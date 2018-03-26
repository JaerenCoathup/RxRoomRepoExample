package com.example.jaerencoathup.exampleapp.Dagger.Modules;

import com.example.jaerencoathup.exampleapp.BuildConfig;
import com.example.jaerencoathup.exampleapp.Networking.ApiService;
import com.example.jaerencoathup.exampleapp.Networking.Interceptors.QueryParameterInterceptor;
import com.example.jaerencoathup.exampleapp.Networking.Interceptors.TimeoutInterceptor;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.schedulers.Schedulers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jaerencoathup on 05/05/2017.
 */
@Module
public class NetworkingModule {

    private String baseUrl = "http://api.openweathermap.org/data/2.5";

    @Singleton
    @Provides
    public OkHttpClient provideClient() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        if (BuildConfig.DEBUG) {
            clientBuilder.addNetworkInterceptor(new StethoInterceptor());
        }
        clientBuilder.addInterceptor(new QueryParameterInterceptor("appid", "ff287173dfc02d8de3aad212143202e1"));
        return clientBuilder.build();
    }

    @Singleton
    @Provides
    public Retrofit provideRetrofit(OkHttpClient client) {
        //Can register type adapters here
        Gson gson = new GsonBuilder().create();
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .build();
    }

    @Singleton
    @Provides
    public ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }


}
