package com.example.android.quakereport;

public class Earthquake {
    private String mPlace;
    private String mMag;
    private String mDate;
    public Earthquake(String ePlace, String eMag, String eDate)
    {
        mPlace = ePlace;
        mMag = eMag;
        mDate = eDate;
    }
    public String getPlace() {
        return mPlace;
    }
    public String getMagnitude() {
        return mMag;
    }
    public String getDate() {
        return mDate;
    }
}

