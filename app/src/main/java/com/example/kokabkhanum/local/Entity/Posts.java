package com.example.kokabkhanum.local.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Posts {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "post_id")
    private int PostID;

    @ColumnInfo(name = "date_gmt")
    private String dateGmt;
    @ColumnInfo(name = "modified_gmt")
    private String modifiedGmt;
    @ColumnInfo(name = "title_rendered")
    private String titleRendered;
    @ColumnInfo(name = "content_rendered")
    private String contentRendered;
    @ColumnInfo(name = "feature_media")
    private int featureMedia;


    public Posts() {
    }

    public Posts(int postID, String dateGmt, String modifiedGmt,
                 String titleRendered, String contentRendered,
                 int featureMedia) {
        PostID = postID;
        this.dateGmt = dateGmt;
        this.modifiedGmt = modifiedGmt;
        this.titleRendered = titleRendered;
        this.contentRendered = contentRendered;
        this.featureMedia = featureMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostID() {
        return PostID;
    }

    public void setPostID(int postID) {
        PostID = postID;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public String getTitleRendered() {
        return titleRendered;
    }

    public void setTitleRendered(String titleRendered) {
        this.titleRendered = titleRendered;
    }

    public String getContentRendered() {
        return contentRendered;
    }

    public void setContentRendered(String contentRendered) {
        this.contentRendered = contentRendered;
    }

    public int getFeatureMedia() {
        return featureMedia;
    }

    public void setFeatureMedia(int featureMedia) {
        this.featureMedia = featureMedia;
    }
}
