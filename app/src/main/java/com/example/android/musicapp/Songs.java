package com.example.android.musicapp;

public class Songs {

    private String mSongName;



    private String mArtistName;

    public Songs(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;

    }
    public void setmSongName(String mSongName) {
        this.mSongName = mSongName;
    }

    public void setmArtistName(String mArtistName) {
        this.mArtistName = mArtistName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName(){
        return mArtistName;
    }

}
