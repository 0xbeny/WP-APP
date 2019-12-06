package com.example.kokabkhanum.presentation.di;


import android.app.Application;

import com.example.kokabkhanum.MyApplication;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBuilderModule.class,
        ViewModelProviderFactoryModule.class
})

public interface AppComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}
