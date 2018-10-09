package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_song);


        Intent intent = getIntent();

        String songName = intent.getStringExtra("song_name");

        String artistName = intent.getStringExtra("artist_name");

        TextView songNameTextView = findViewById(R.id.playing_song_name);
        songNameTextView.setText(songName);

        TextView artistNameTextView = findViewById(R.id.playing_song_artist);
        artistNameTextView.setText(artistName);
    }
}
