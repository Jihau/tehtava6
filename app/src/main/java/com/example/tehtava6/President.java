package com.example.tehtava6;

import androidx.annotation.NonNull;

public class President {
    private final String name, kommentti;
    private final int startYear, endYear;

    public President(String name, int startYear, int endYear, String kommentti) {
        this.name = name;
        this.startYear = startYear;
        this.endYear = endYear;
        this.kommentti = kommentti;
    }

    public String getName(){
        return name;
    }
    public int getStartYear(){
        return startYear;
    }
    public int getEndYear(){
        return endYear;
    }
    public String getKommentti(){
        return kommentti;
    }

    @NonNull
    @Override
    public String toString(){
        return name;
    }
}