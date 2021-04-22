package com.company.Models;

import com.company.Enums.Clasification;

public abstract class Item {
    private String title;
    private String date;
    private String originCountry;
    private String description;
    private Clasification clasification;
    private Integer Count;

    public Item(String title, String date, String originCountry, String description, Clasification clasification, Integer count) {
        this.title = title;
        this.date = date;
        this.originCountry = originCountry;
        this.description = description;
        this.clasification = clasification;
        Count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Clasification getClasification() {
        return clasification;
    }

    public void setClasification(Clasification clasification) {
        this.clasification = clasification;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }
}
