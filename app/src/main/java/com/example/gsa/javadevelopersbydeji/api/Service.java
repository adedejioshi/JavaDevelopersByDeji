package com.example.gsa.javadevelopersbydeji.api;

import com.example.gsa.javadevelopersbydeji.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by GSA on 10/9/2017.
 */

public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();
}
