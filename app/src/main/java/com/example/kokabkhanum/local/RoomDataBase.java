package com.example.kokabkhanum.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.kokabkhanum.local.Entity.Category;
import com.example.kokabkhanum.local.Entity.Posts;

@Database(entities = {Category.class, Posts.class},exportSchema = false,version = 3)
public abstract class RoomDataBase extends RoomDatabase {

    private static RoomDataBase getInstance;

    public abstract DaoCategory daoCategory();

    public static RoomDataBase getInstance(Context context){

        if (getInstance==null){

            getInstance= Room.databaseBuilder(context.getApplicationContext(),
                    RoomDataBase.class,"database-machine")
                    .build();

        }

     return getInstance;

    }


}
