package com.example.kokabkhanum.domain.repository;

import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.remote.entity.models.Category.Categories;
import com.example.kokabkhanum.remote.entity.models.posts.Posts;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public interface SplashRepository {
    Single<List<Categories>> AllCategory();
    Single<List<Posts>> AllPosts(long category);
    long InsertCategories(Category category);
    long InsertPosts(com.example.kokabkhanum.local.Entity.Posts Posts);

    Flowable<List<Category>> checkExistence(Boolean isExist);

}
