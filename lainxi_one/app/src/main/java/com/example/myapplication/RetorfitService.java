package com.example.myapplication;

import com.example.myapplication.bean.Bean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetorfitService {
    @GET("getTangPoetry")
    Call<Bean> call (@Query("page")int page);
}
