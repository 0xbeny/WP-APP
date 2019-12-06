package com.example.kokabkhanum.local;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.kokabkhanum.local.Entity.Category;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface DaoCategory {
    @Insert
    long InsertCategory(Category category);

    @Query("SELECT name from category order by name ASC")
    Flowable<List<Category>> getCatName();

}
