package com.example.kokabkhanum.presentation.ui.splash;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.kokabkhanum.domain.usecase.SplashUsecase;
import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.local.Entity.Posts;

import javax.inject.Inject;

import io.reactivex.schedulers.Schedulers;

public class SplashViewModel extends ViewModel {

    private static final String TAG = "SplashViewModel";
    SplashUsecase splashUsecase;
    private Category category;
    private Posts posts;
    private String name, description, href;
    private String dateGmt, ModifiedGmt, embeddedFeatureMediaLink, contentRendered, titleRendered;
    private int id, count;
    private int postId, featureMedia;

    @Inject
    public SplashViewModel(SplashUsecase splashUsecase, Category category, Posts posts) {
        this.splashUsecase = splashUsecase;
        this.category = category;
        this.posts = posts;
    }


    public void CategoryRequestAndInsert() {
        splashUsecase.getAllCategories()
                .toObservable()
                .subscribeOn(Schedulers.io())

                .observeOn(Schedulers.newThread())
                .subscribe(
                        response -> {


                            for (int i = 0; i < response.size(); i++) {
                                id = response.get(i).getId();

                                count = response.get(i).getCount();
                                description = response.get(i).getDescription();
                                name = response.get(i).getName();
                                href = response.get(i).getLinks().getWpPostType().get(0).getHref();
                                category = new Category(id, name, count, description, href);
                                Log.d(TAG, "CategoryRequestAndInsert: " + Thread.currentThread());
                                splashUsecase.InsertAllCategories(category);

                            }
                        }
                        , error -> {

                            Log.d(TAG, "CategoryRequestAndInsert: " + error.getMessage());

                        }
                );
    }


    public void GetAllPostsANDInsert(long category) {
        splashUsecase.AllPosts(category)
                .toObservable()
                .subscribeOn(Schedulers.computation())
                .observeOn(Schedulers.newThread())
                .subscribe(response -> {
                    for (int i = 0; i < response.size(); i++) {
                        postId = response.get(i).getId();
                        dateGmt = response.get(i).getDateGmt();
                        ModifiedGmt = response.get(i).getModifiedGmt();
                        titleRendered = response.get(i).getTitle().getRendered();
                        contentRendered = response.get(i).getContent().getRendered();
                        featureMedia = response.get(i).getFeaturedMedia();
                        posts = new Posts(postId, dateGmt, ModifiedGmt, titleRendered, contentRendered, featureMedia);
                        splashUsecase.InsertPosts(posts);
                    }

                }, error -> {
                });

    }


}
