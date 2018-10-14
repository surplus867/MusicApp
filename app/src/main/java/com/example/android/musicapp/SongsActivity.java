package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class SongsActivity extends AppCompatActivity {
    ListView listView;
    SongsAdapter adapter;
    //Create an array of songs
    List<Songs> songsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);


         listView = (ListView) findViewById(R.id.list_songs);

                songsList.add(new Songs(getString(R.string.song_1_name)
                        , getString(R.string.song_1_artist)));
                songsList.add(new Songs(getString(R.string.song_2_name)
                        , getString(R.string.song_2_artist)));
                songsList.add(new Songs(getString(R.string.song_3_name)
                        , getString(R.string.song_3_artist)));
                songsList.add(new Songs(getString(R.string.song_4_name)
                        , getString(R.string.song_4_artist)));
                songsList.add(new Songs(getString(R.string.song_5_name)
                        , getString(R.string.song_5_artist)));
                songsList.add(new Songs(getString(R.string.song_6_name)
                        , getString(R.string.song_6_artist)));
                songsList.add(new Songs(getString(R.string.song_7_name)
                        , getString(R.string.song_7_artist)));
                songsList.add(new Songs(getString(R.string.song_8_name)
                        , getString(R.string.song_8_artist)));

                adapter = new SongsAdapter(this, songsList);
                 listView.setAdapter(adapter);
                 }
        }