package com.example.kokabkhanum.remote.entity;

import com.example.kokabkhanum.remote.entity.models.Category.Categories;
import com.example.kokabkhanum.remote.SplashServices;
import com.example.kokabkhanum.remote.entity.models.posts.Posts;

import java.util.List;
import javax.inject.Inject;
import io.reactivex.Single;

public class SplashRemote {
    SplashServices splashServices;

    @Inject
    public SplashRemote(SplashServices splashServices) {
        this.splashServices = splashServices;
    }

    public Single<List<Categories>> getAllCategories() {
        return splashServices.categoriesSingle();
    }

    public Single<List<Posts>> getAllPost(long category) {
        return splashServices.PostDetailSingle(category);
    }

}
