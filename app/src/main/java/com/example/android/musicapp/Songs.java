package com.example.android.musicapp;

public class Songs {

    private String mSongName;

    private String mArtistName;

    public Songs(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;

    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName(){
        return mArtistName;
    }
}