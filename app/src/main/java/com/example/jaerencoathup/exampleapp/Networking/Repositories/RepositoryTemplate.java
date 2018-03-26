package com.example.jaerencoathup.exampleapp.Networking.Repositories;

import com.example.jaerencoathup.exampleapp.Networking.ErrorHandler;
import com.google.gson.JsonSyntaxException;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

import retrofit2.HttpException;
import retrofit2.Response;

/**
 * Created by jaerencoathup on 18/11/2017.
 */

public class RepositoryTemplate {
    /**
     * If Throwable is not an http exception -> crash the app.
     */
    protected void handleNonHttpException(Throwable throwable) {
        // if not an HttpException throw further
        if (throwable instanceof HttpException) {

        } else if (throwable instanceof JsonSyntaxException) {

        } else if (throwable instanceof SocketTimeoutException) {

        } else if (throwable instanceof ConnectException) {

        } else {
            throw new RuntimeException(throwable);
        }
    }
}
