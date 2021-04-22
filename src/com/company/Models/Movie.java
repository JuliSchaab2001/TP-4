package com.company.Models;

import com.company.Enums.Clasification;
import com.company.Enums.MovieType;

public class Movie extends Item{
    private Integer duration;
    private MovieType genre;

    public Movie(String title, String date, String originCountry, String description, Clasification clasification, Integer duration, MovieType genre) {
        super(title, date, originCountry, description, clasification);
        this.duration = duration;
        this.genre = genre;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public MovieType getGenre() {
        return genre;
    }

    public void setGenre(MovieType genre) {
        this.genre = genre;
    }
}
