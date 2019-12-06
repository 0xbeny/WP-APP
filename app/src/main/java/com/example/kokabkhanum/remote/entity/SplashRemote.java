package com.example.kokabkhanum.remote.entity;

import com.example.kokabkhanum.remote.entity.models.Categories;
import com.example.kokabkhanum.remote.SplashServices;
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
}
