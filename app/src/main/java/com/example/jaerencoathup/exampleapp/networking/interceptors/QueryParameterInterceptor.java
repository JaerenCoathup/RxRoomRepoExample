package com.example.jaerencoathup.exampleapp.networking.interceptors;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by jaerencoathup on 25/03/2018.
 */

public class QueryParameterInterceptor implements Interceptor {

    private String key;
    private String value;

    public QueryParameterInterceptor(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        HttpUrl originalHttpUrl = original.url();

        HttpUrl url = originalHttpUrl.newBuilder()
                .addQueryParameter(key, value)
                .build();

        // Request customization: add request headers
        Request.Builder requestBuilder = original.newBuilder()
                .url(url);

        Request request = requestBuilder.build();
        return chain.proceed(request);
    }
}
