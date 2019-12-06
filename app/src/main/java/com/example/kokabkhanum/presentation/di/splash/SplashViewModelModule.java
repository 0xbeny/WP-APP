package com.example.kokabkhanum.presentation.di.splash;

import androidx.lifecycle.ViewModel;
import com.example.kokabkhanum.presentation.di.ViewModelKey;
import com.example.kokabkhanum.presentation.ui.splash.SplashViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class SplashViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(value = SplashViewModel.class)
    public abstract ViewModel bind(SplashViewModel splashViewModel);


}
