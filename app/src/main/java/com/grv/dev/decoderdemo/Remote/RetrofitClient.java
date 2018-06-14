package com.grv.dev.decoderdemo.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {

    public static final String BASE_URL = "http://dcoder.tech/";

    private static Retrofit retrofit = null;
    public static Retrofit getClient()
    {
        if (retrofit==null){

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }

}
