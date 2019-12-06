package com.example.kokabkhanum.domain.usecase;

import androidx.lifecycle.LiveData;

import com.example.kokabkhanum.domain.repository.CatListRepository;
import com.example.kokabkhanum.local.Entity.Category;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

public class CatListUseCase {

    private CatListRepository catListRepository;
    @Inject
    public CatListUseCase(CatListRepository catListRepository){
        this.catListRepository=catListRepository;
    }
    public Flowable<List<Category>> getCatName(){
        return catListRepository.getCatName();
    }

}
