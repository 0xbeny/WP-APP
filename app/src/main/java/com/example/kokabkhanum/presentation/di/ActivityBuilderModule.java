package com.example.kokabkhanum.presentation.di;

import com.example.kokabkhanum.presentation.di.categoryList.CatListModule;
import com.example.kokabkhanum.presentation.di.categoryList.CatListViewModelModule;
import com.example.kokabkhanum.presentation.di.splash.SplashViewModelModule;
import com.example.kokabkhanum.presentation.ui.CategoryList.CategoryListActivity;
import com.example.kokabkhanum.presentation.ui.splash.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = SplashViewModelModule.class)
    abstract SplashActivity splashActivity();


    @ContributesAndroidInjector(modules = {CatListViewModelModule.class})
    abstract CategoryListActivity categoryListActivity();
}
