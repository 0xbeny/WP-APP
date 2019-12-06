package com.example.kokabkhanum.local;

import androidx.lifecycle.LiveData;

import com.example.kokabkhanum.local.Entity.Category;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

public class DataBaseRepository {

    private DaoCategory daoCategory;

    private Category category;

    @Inject
    public DataBaseRepository(DaoCategory daoCategory,Category category) {

        this.daoCategory = daoCategory;
        this.category = category;

    }

    public long insert(Category category) {

        return daoCategory.InsertCategory(category);

    }
    public Flowable<List<Category>> getCatName(){
        return daoCategory.getCatName();
    }


}
