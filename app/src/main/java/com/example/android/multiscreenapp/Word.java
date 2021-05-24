package com.example.android.multiscreenapp;

public class Word {
    private String DefaultTranslation;
    private String GermanTranslation;

    public Word(String DefaultTranslation, String MiwokTranslation) {
        this.DefaultTranslation = DefaultTranslation;
        this.GermanTranslation = MiwokTranslation;
    }

    public String getDefaultTranslation() {
        return DefaultTranslation;
    }

    public String getGermanTranslation() {
        return GermanTranslation;
    }
}
