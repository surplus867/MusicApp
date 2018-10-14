package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {
    //String ARG_SONG= getIntent().getStringExtra("ARG_SONG");
    //public static final String ARG_SONG = "ARG_SONG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_song);

        TextView songNameTextView = findViewById(R.id.playing_song_name);
        songNameTextView.setText(songName);

        TextView artistNameTextView = findViewById(R.id.playing_song_artist);
        artistNameTextView.setText(artistName);
    }

        Intent intent = getIntent();

        String songName= intent.getStringExtra("songNameKey");

        String artistName= intent.getStringExtra("artistNameKey");

        //Songs songs = getIntent().getParcelableExtra("songs");


}
