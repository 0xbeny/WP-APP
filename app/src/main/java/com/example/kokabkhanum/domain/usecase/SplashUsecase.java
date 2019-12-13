package com.example.kokabkhanum.domain.usecase;

import com.example.kokabkhanum.domain.repository.SplashRepository;
import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.remote.entity.models.Category.Categories;
import com.example.kokabkhanum.remote.entity.models.posts.Posts;

import java.util.List;
import javax.inject.Inject;

import io.reactivex.Flowable;
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
    public Single<List<Posts>> AllPosts(long category) {
        return splashRepository.AllPosts(category);
    }

    public long InsertAllCategories(Category category){

       return splashRepository.InsertCategories(category);

    }
    public long InsertPosts(com.example.kokabkhanum.local.Entity.Posts posts){

        return splashRepository.InsertPosts(posts);

    }
    public Flowable<List<Category>> checkExistence(Boolean isExist){
        return splashRepository.checkExistence(true);
    }

}
