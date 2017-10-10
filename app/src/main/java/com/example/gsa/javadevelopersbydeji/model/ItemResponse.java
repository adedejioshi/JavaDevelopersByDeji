package com.example.gsa.javadevelopersbydeji.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by GSA on 10/9/2017.
 */

public class ItemResponse {

    @SerializedName("items")
    @Expose
    private List<Item> items;

    public List<Item> getItems(){
        return items;
    }

    public void setItems(List<Item>items){
        this.items = items;
    }
}
