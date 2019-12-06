package com.example.kokabkhanum.presentation.ui.CategoryList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.example.kokabkhanum.presentation.di.view_model.ViewModelProviderFactory;
import com.example.kokabkhanum.R;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import dagger.android.support.DaggerFragment;

public class CategoryListActivity extends DaggerAppCompatActivity {

    CatListViewModel listViewModel;
    @Inject
    ViewModelProviderFactory viewModelProviderFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        listViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(CatListViewModel.class);
        Log.d("onCreated", "onCreate: view model is created");
        listViewModel.getCatName();
    }
}
