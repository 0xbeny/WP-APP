package com.example.kokabkhanum.presentation.ui.splash;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.ViewModelProviders;

import com.example.kokabkhanum.presentation.di.view_model.ViewModelProviderFactory;
import com.example.kokabkhanum.R;
import com.example.kokabkhanum.presentation.ui.CategoryList.CategoryListActivity;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class SplashActivity extends DaggerAppCompatActivity {

    SplashViewModel splashViewModel;
    @Inject
    ViewModelProviderFactory viewModelProviderFactory;
    @Inject
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        splashViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(SplashViewModel.class);
        //get All Categories from retrofit && Insert Data From Retrofit to Room Database :)
        splashViewModel.CategoryRequestAndInsert();
        handler.postDelayed(() -> {
            Intent intent = new Intent(this, CategoryListActivity.class);
            startActivity(intent);


        }, 3000);


    }
}
