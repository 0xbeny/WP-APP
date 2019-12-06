package com.example.kokabkhanum.presentation.ui.splash;

import android.os.AsyncTask;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kokabkhanum.domain.usecase.SplashUsecase;
import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.remote.entity.models.Categories;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SplashViewModel extends ViewModel {

    private static final String TAG = "SplashViewModel";
    SplashUsecase splashUsecase;
    private Category category;
    public static String name,description,href;
    public static int id,count;

    @Inject
    public SplashViewModel(SplashUsecase splashUsecase, Category category) {
        this.splashUsecase = splashUsecase;
        this.category = category;
    }




    public void CategoryRequestAndInsert() {
        splashUsecase.getAllCategories()
                .toObservable()
                .subscribeOn(Schedulers.computation())
                .observeOn(Schedulers.newThread())
                .subscribe(
                        response -> {

                            for (int i = 0; i < response.size(); i++) {

                                id = response.get(i).getId();
                                count=response.get(i).getCount();
                                description=response.get(i).getDescription();
                                name = response.get(i).getName();
                                href=response.get(i).getLinks().getWpPostType().get(0).getHref();
                                category=new Category(id,name,count,description,href);
                                Log.d(TAG, "CategoryRequestAndInsert: "+Thread.currentThread());
                                splashUsecase.InsertAllCategories(category);

                            }
                        }
                        , error -> {

                            Log.d(TAG, "CategoryRequestAndInsert: " + error.getMessage());

                        }
                );
    }



}
