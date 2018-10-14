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

        TextView songNameTextView = findViewById(R.id.playing_song_name);

        TextView artistNameTextView = findViewById(R.id.playing_song_artist);

        Intent intent = getIntent();
        //Checking and see the intent is null
        if (intent != null){

            String songName = intent.getStringExtra("songNameKey");
            String artistName = intent.getStringExtra("artistNameKey");
            songNameTextView.setText(songName);
            artistNameTextView.setText(artistName);
        }

    }
}
