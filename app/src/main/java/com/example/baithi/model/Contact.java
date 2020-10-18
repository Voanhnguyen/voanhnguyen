package com.example.baithi.model;

public class Contact {
    private int mImage;
    private String mName;
    private String mNumber;

    public Contact(int mImage, String mName, String mNumber) {
        this.mImage = mImage;
        this.mName = mName;
        this.mNumber = mNumber;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}

