package com.example.kokabkhanum.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.local.Entity.Posts;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface DaoCategory {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long InsertCategory(Category category);
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long InsertPosts(Posts posts);

    @Query("SELECT * from category")
    Flowable<List<Category>> getCatName();


}
