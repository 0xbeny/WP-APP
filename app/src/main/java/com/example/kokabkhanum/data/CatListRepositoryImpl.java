package com.example.kokabkhanum.data;

import androidx.lifecycle.LiveData;

import com.example.kokabkhanum.domain.repository.CatListRepository;
import com.example.kokabkhanum.local.DataBaseRepository;
import com.example.kokabkhanum.local.Entity.Category;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

public class CatListRepositoryImpl implements CatListRepository {
    DataBaseRepository dataBaseRepository;
    @Inject
    public CatListRepositoryImpl(DataBaseRepository dataBaseRepository){
        this.dataBaseRepository=dataBaseRepository;
    }

    @Override
    public Flowable<List<Category>> getCatName() {
        return dataBaseRepository.getCatName();
    }
}
