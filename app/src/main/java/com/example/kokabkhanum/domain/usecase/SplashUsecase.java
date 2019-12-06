package com.example.kokabkhanum.domain.usecase;

import com.example.kokabkhanum.domain.repository.SplashRepository;
import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.remote.entity.models.Categories;
import java.util.List;
import javax.inject.Inject;

import io.reactivex.Single;

public class SplashUsecase {

   private SplashRepository splashRepository;

    @Inject
    public SplashUsecase(SplashRepository splashRepository){

        this.splashRepository=splashRepository;

    }

    public Single<List<Categories>> getAllCategories(){

        return splashRepository.AllCategory();

    }

    public long InsertAllCategories(Category category){

       return splashRepository.InsertCategories(category);

    }

}
