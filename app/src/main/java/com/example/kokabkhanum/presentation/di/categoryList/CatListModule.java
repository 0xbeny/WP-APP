package com.example.kokabkhanum.presentation.di.categoryList;

import com.example.kokabkhanum.data.CatListRepositoryImpl;
import com.example.kokabkhanum.domain.repository.CatListRepository;
import com.example.kokabkhanum.domain.usecase.CatListUseCase;
import com.example.kokabkhanum.local.DaoCategory;
import com.example.kokabkhanum.local.DataBaseRepository;
import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.presentation.ui.CategoryList.adapter.CategoryRecyclerView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CatListModule {

//    @Singleton
//    @Provides
//    static DataBaseRepository ProvidesDataBaseRepository(DaoCategory daoCategory, Category category) {
//        return new DataBaseRepository(daoCategory, category);
//    }

    @Singleton
    @Provides
    static CatListRepository ProvidesCatListRepository(DataBaseRepository dataBaseRepository) {
        return new CatListRepositoryImpl(dataBaseRepository);
    }

    @Singleton
    @Provides
    static CatListUseCase ProvidesCatListUseCase(CatListRepository catListRepository) {
        return new CatListUseCase(catListRepository);
    }
    @Provides
    static CategoryRecyclerView categoryRecyclerView(){
        return new CategoryRecyclerView();
    }


}
