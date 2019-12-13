package com.example.kokabkhanum.local.Entity;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Fts4;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Fts4
@Entity(tableName = "Category")
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
    @ColumnInfo(name = "href")
    private String href;




    public Category(int catID, String name, int count, String description, String href) {
        this.CatID = catID;
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
    public Category( String name) {

        this.name = name;
    }

    public Category() {
    }
}
