package com.example.kokabkhanum.local.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Category {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "CatID")
    private int CatID;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "count")
    private int count;
    @ColumnInfo(name = "description")
    private String description;


    public Category(int catID, String name, int count, String description, String href) {
        CatID = catID;
        this.name = name;
        this.count = count;
        this.description = description;
        this.href = href;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @ColumnInfo(name = "href")
    private String href;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatID() {
        return CatID;
    }

    public void setCatID(int catID) {
        CatID = catID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Ignore
    public Category(@NonNull String name) {

        this.name = name;
    }

    public Category() {
    }
}
