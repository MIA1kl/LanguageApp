package com.example.android.multiscreenapp;

public class Word {
    private String DefaultTranslation;
    private String GermanTranslation;
    private int imageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;

    public Word(String DefaultTranslation, String MiwokTranslation,int audioResourceId) {
        this.DefaultTranslation = DefaultTranslation;
        this.GermanTranslation = MiwokTranslation;
        mAudioResourceId=audioResourceId;
    }

    public Word(String defaultTranslation, String germanTranslation, int imageResourceId,int audioResourceId) {
        DefaultTranslation = defaultTranslation;
        GermanTranslation = germanTranslation;
        this.imageResourceId = imageResourceId;
        mAudioResourceId=audioResourceId;
    }

    public String getDefaultTranslation() {
        return DefaultTranslation;
    }

    public String getGermanTranslation() {
        return GermanTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
