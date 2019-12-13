package com.example.kokabkhanum.remote;

import com.example.kokabkhanum.remote.entity.models.Category.Categories;
import com.example.kokabkhanum.remote.entity.models.posts.Posts;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SplashServices {
    @GET("categories")
    Single<List<Categories>> categoriesSingle();
    @GET("posts?")
    Single<List<Posts>> PostDetailSingle(@Query("categories={id}#") long CategoryID);
}
