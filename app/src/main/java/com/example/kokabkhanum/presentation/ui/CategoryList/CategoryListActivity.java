package com.example.kokabkhanum.presentation.ui.CategoryList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.kokabkhanum.presentation.di.view_model.ViewModelProviderFactory;
import com.example.kokabkhanum.R;
import com.example.kokabkhanum.presentation.ui.CategoryList.adapter.CategoryRecyclerAdapter;
import com.example.kokabkhanum.presentation.ui.CategoryList.adapter.OnItem;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import dagger.android.support.DaggerFragment;

public class CategoryListActivity extends DaggerAppCompatActivity {

    CatListViewModel listViewModel;
    @Inject
    ViewModelProviderFactory viewModelProviderFactory;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);

        recyclerView = findViewById(R.id.CatListRecycler);

        listViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(CatListViewModel.class);

        Log.d("onCreated", "onCreate: view model is created");
        listViewModel.getCatName();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        final CategoryRecyclerAdapter adapter = new CategoryRecyclerAdapter();
        recyclerView.setAdapter(adapter);
        adapter.setOnItem(item -> {
            Toast.makeText(this, "Item : "+item, Toast.LENGTH_SHORT).show();
        });
        listViewModel.categoriesMutableLiveData.observe(this,categories ->  {adapter.setUser(categories);

        });

    }
}
