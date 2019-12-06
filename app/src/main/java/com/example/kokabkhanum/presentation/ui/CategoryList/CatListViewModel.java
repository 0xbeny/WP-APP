package com.example.kokabkhanum.presentation.ui.CategoryList;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.kokabkhanum.domain.usecase.CatListUseCase;
import com.example.kokabkhanum.local.Entity.Category;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import static android.content.ContentValues.TAG;

public class CatListViewModel extends ViewModel {

    CatListUseCase catListUseCase;
    MutableLiveData<Category> categoriesMutableLiveData = new MutableLiveData<>();
//    MutableLiveData<List<Category>> listMutableLiveData=new MutableLiveData<>();
    @Inject
    public CatListViewModel(CatListUseCase catListUseCase) {
        this.catListUseCase = catListUseCase;
    }

    public void getCatName() {
        catListUseCase.getCatName()
        .toObservable()
        .subscribeOn(Schedulers.computation())
        .observeOn(Schedulers.newThread())
        .subscribe(response-> {
            Log.d(TAG, "getCatName: "+response.size());

        },error->{});

    }


}
