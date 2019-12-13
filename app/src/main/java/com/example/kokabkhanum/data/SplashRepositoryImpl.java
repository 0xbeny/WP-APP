package com.example.kokabkhanum.data;

import com.example.kokabkhanum.domain.repository.SplashRepository;
import com.example.kokabkhanum.local.DataBaseRepository;
import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.local.Entity.Posts;
import com.example.kokabkhanum.remote.entity.SplashRemote;
import com.example.kokabkhanum.remote.entity.models.Category.Categories;


import java.util.List;
import javax.inject.Inject;

import io.reactivex.Flowable;
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
    public Single<List<com.example.kokabkhanum.remote.entity.models.posts.Posts>> AllPosts(long category) {
        return splashRemote.getAllPost(category);
    }

    @Override
    public long InsertCategories(Category category) {
       return dataBaseRepository.insertCategory(category);
//        new InsertCategoriesAsyncTask(dataBaseRepository).execute(category);

    }
    @Override
    public long InsertPosts(Posts posts) {
        return dataBaseRepository.insertPosts(posts);
//        new InsertCategoriesAsyncTask(dataBaseRepository).execute(category);

    }

    @Override
    public Flowable<List<Category>> checkExistence(Boolean isExist) {
        return dataBaseRepository.getCatName();
    }


}
