package com.example.kokabkhanum.remote.entity.models.posts;

import com.example.kokabkhanum.remote.entity.models.Category.Self;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Title {
    @SerializedName("rendered")
    @Expose
    private String rendered;

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }
}