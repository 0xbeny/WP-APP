package com.example.kokabkhanum.data;

import com.example.kokabkhanum.domain.repository.SplashRepository;
import com.example.kokabkhanum.local.DataBaseRepository;
import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.remote.entity.SplashRemote;
import com.example.kokabkhanum.remote.entity.models.Categories;
import java.util.List;
import javax.inject.Inject;

import io.reactivex.Single;

public class SplashRepositoryImpl implements SplashRepository {

    public SplashRemote splashRemote;
    //    private DaoCategory daoCategory;
    DataBaseRepository dataBaseRepository;

    @Inject
    public SplashRepositoryImpl(SplashRemote splashRemote, DataBaseRepository dataBaseRepository) {
        this.splashRemote = splashRemote;
//        this.daoCategory = daoCategory;
        this.dataBaseRepository = dataBaseRepository;

    }


    @Override
    public Single<List<Categories>> AllCategory() {
        return splashRemote.getAllCategories();
    }

    @Override
    public long InsertCategories(Category category) {
       return dataBaseRepository.insert(category);
//        new InsertCategoriesAsyncTask(dataBaseRepository).execute(category);

    }



}
