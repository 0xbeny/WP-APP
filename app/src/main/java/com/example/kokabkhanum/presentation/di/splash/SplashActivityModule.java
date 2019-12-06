package com.example.kokabkhanum.presentation.di.splash;

import android.os.Handler;
import android.os.HandlerThread;

import com.example.kokabkhanum.data.SplashRepositoryImpl;
import com.example.kokabkhanum.domain.repository.SplashRepository;
import com.example.kokabkhanum.domain.usecase.SplashUsecase;
import com.example.kokabkhanum.local.DaoCategory;
import com.example.kokabkhanum.local.DataBaseRepository;
import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.local.RoomDataBase;
import com.example.kokabkhanum.remote.entity.SplashRemote;
import com.example.kokabkhanum.remote.SplashServices;

import java.util.logging.LogRecord;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class SplashActivityModule {
    @Singleton
    @Provides
    static SplashServices ProvidesSplashServie(Retrofit retrofit) {
        return retrofit.create(SplashServices.class);
    }

    @Singleton
    @Provides
    static SplashRemote ProvidesSplashRemote(SplashServices splashServices) {
        return new SplashRemote(splashServices);
    }

    @Singleton
    @Provides
    static SplashRepository ProvidesSplashRepository(SplashRemote splashRemote,DataBaseRepository dataBaseRepository) {
        return new SplashRepositoryImpl(splashRemote, dataBaseRepository);
    }

    @Singleton
    @Provides
    static SplashUsecase ProvidesSplashUseCase(SplashRepository splashRepository) {
        return new SplashUsecase(splashRepository);
    }

    @Singleton
    @Provides
    static DaoCategory ProvidesDaoCategory( RoomDataBase roomDataBase) {
        return roomDataBase.daoCategory();
    }

    @Singleton
    @Provides
    static Category ProvidesCategory() {
        return new Category();
    }


    @Singleton
    @Provides
    static DataBaseRepository ProvidesDataBaseRepository(DaoCategory daoCategory,Category category) {
        return new DataBaseRepository(daoCategory,category);
    }
    @Singleton
    @Provides
    static Handler ProvideSplashToCat(){
        return new android.os.Handler();


    }
}
