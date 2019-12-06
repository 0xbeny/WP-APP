package com.example.kokabkhanum.presentation.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.kokabkhanum.presentation.di.view_model.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelProviderFactoryModule {

    @Binds
    abstract ViewModelProvider.Factory factory(ViewModelProviderFactory viewModelProviderFactory);
}
