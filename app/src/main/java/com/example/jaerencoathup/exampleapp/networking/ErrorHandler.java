package com.example.jaerencoathup.exampleapp.networking;

import retrofit2.Response;

/**
 * Created by jaerencoathup on 18/11/2017.
 */

public interface ErrorHandler {
    void onError(Response response);
}
