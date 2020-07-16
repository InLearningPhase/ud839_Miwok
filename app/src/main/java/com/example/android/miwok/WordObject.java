package com.example.android.miwok;

public class WordObject {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageResource;

    public WordObject(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public WordObject(String mDefaultTranslation, String mMiwokTranslation, int imageResource) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.imageResource = imageResource;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResource() {
        return imageResource;
    }
}
