package com.example.kokabkhanum.local;

import androidx.lifecycle.LiveData;

import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.local.Entity.Posts;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

public class DataBaseRepository {

    private DaoCategory daoCategory;

    private Category category;
    private Posts posts;

    @Inject
    public DataBaseRepository(DaoCategory daoCategory, Category category, Posts posts) {

        this.daoCategory = daoCategory;
        this.category = category;
        this.posts=posts;

    }

    public long insertCategory(Category category) {

        return daoCategory.InsertCategory(category);

    }
    public long insertPosts(Posts posts) {

        return daoCategory.InsertPosts(posts);

    }

    public Flowable<List<Category>> getCatName(){
        return daoCategory.getCatName();
    }


}
