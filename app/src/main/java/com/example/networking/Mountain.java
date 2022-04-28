package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    @SerializedName("ID")
    public String id;
    public String name;
    public String type;
    public String company;
    public String location;
    public String category;
    @SerializedName("size")
    public int meters;
    @SerializedName("cost")
    public int feet;
    public Auxdata auxdata;
}
