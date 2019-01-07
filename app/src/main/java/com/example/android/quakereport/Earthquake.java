package com.example.android.quakereport;

public class Earthquake {
    private String mPlace;
    private String mMag;
    private long mDate;
    public Earthquake(String eMag, String ePlace, long eDate)
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
    public long getDate() {
        return mDate;
    }
}

