package com.example.kokabkhanum.presentation.di.categoryList;

import androidx.lifecycle.ViewModel;

import com.example.kokabkhanum.presentation.di.ViewModelKey;
import com.example.kokabkhanum.presentation.ui.CategoryList.CatListViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class CatListViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(value = CatListViewModel.class)
    public abstract ViewModel bindCatListViewModel(CatListViewModel catListViewModel);


/*
  @Singleton
  @Provides
  static   CatListViewModel catListViewModel(CatListUseCase catListUseCase){
    return new CatListViewModel(catListUseCase);
  }
*/
}
