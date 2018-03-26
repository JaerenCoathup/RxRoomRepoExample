package com.example.jaerencoathup.exampleapp.Networking.Interceptors;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by jaerencoathup on 25/11/2017.
 */

public class TimeoutInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        Response response = chain.proceed(request);

        chain.withConnectTimeout(5, TimeUnit.SECONDS);
        chain.withReadTimeout(5, TimeUnit.SECONDS);
        chain.withWriteTimeout(5, TimeUnit.SECONDS);

        return response;

//        switch (request.method()) {
//            case "GET":
//                chain.withConnectTimeout(5, TimeUnit.SECONDS);
//                chain.withReadTimeout(5, TimeUnit.SECONDS);
//                break;
//            case "PUT":
//            case "POST":
//            case "DELETE":
//            default:
//                chain.withConnectTimeout(20, TimeUnit.SECONDS);
//                chain.withWriteTimeout(20, TimeUnit.SECONDS);
//                chain.withReadTimeout(20, TimeUnit.SECONDS);
//                break;
//        }
    }
}
