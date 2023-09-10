package com.example.retrofit.service;

import com.example.retrofit.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountryDataService {

    @GET("countries")
    Call<Result> getResult();
}
