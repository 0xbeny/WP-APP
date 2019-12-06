package com.example.kokabkhanum.presentation.di;

import android.app.Application;

import com.example.kokabkhanum.presentation.di.categoryList.CatListModule;
import com.example.kokabkhanum.presentation.di.splash.SplashActivityModule;
import com.example.kokabkhanum.local.RoomDataBase;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = {SplashActivityModule.class, CatListModule.class})
public class AppModule {

    public static final String BASE_URL="http://kokabkhanoom.ir/wp-json/wp/v2/";

    @Singleton
    @Provides
    static Retrofit ProvidesRetrofit(){
    return new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    }
    @Singleton
    @Provides
    static RoomDataBase roomDataBase(Application application){
        return RoomDataBase.getInstance(application);
    }

}
