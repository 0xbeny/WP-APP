package com.example.kokabkhanum.remote;

import com.example.kokabkhanum.remote.entity.models.Categories;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface SplashServices {
    @GET("categories")
    Single<List<Categories>> categoriesSingle();
}
