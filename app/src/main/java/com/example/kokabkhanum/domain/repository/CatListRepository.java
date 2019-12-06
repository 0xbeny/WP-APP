package com.example.kokabkhanum.domain.repository;

import androidx.lifecycle.LiveData;

import com.example.kokabkhanum.local.DataBaseRepository;
import com.example.kokabkhanum.local.Entity.Category;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

public interface CatListRepository {

    Flowable<List<Category>> getCatName();
}
