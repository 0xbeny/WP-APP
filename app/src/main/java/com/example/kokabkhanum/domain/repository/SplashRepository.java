package com.example.kokabkhanum.domain.repository;

import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.remote.entity.models.Categories;

import java.util.List;

import io.reactivex.Single;

public interface SplashRepository {
    Single<List<Categories>> AllCategory();
    long InsertCategories(Category category);


}
