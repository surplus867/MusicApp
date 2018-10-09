package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SongsActivity extends AppCompatActivity {
    ListView listView;
    SongsAdapter adapter;
    List<Songs> songsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        listView = (ListView)findViewById(R.id.list_songs);

        songsList.add(new Songs(getString(R.string.song_1_name)
                ,getString(R.string.song_1_artist)));
        songsList.add(new Songs(getString(R.string.song_2_name)
                ,getString(R.string.song_2_artist)));
        songsList.add(new Songs(getString(R.string.song_3_name)
                ,getString(R.string.song_3_artist)));
        songsList.add(new Songs(getString(R.string.song_4_name)
                ,getString(R.string.song_4_artist)));
        songsList.add(new Songs(getString(R.string.song_5_name)
                ,getString(R.string.song_5_artist)));
        songsList.add(new Songs(getString(R.string.song_6_name)
                ,getString(R.string.song_6_artist)));
        songsList.add(new Songs(getString(R.string.song_7_name)
                ,getString(R.string.song_7_artist)));
        songsList.add(new Songs(getString(R.string.song_8_name)
                ,getString(R.string.song_8_artist)));

        //Songs song1 = new Songs("songName","artistName");
        //Songs song2 = new Songs("songName","artistName");


        //songsList.add(song1);
       //songsList.add(song2);




       adapter = new SongsAdapter(this,songsList);
        listView.setAdapter(adapter);
        //adapter.updateData(songsList);

        //Ivan, can you check the code here and the NowPlayingActivity? I am not sure thanks

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SongsActivity.this,NowPlayingActivity.class);

                //// Get the detail of song at which user has clicked
                ///  What am I missing here???

                ///**
                // * Create a Bundle and put all the track related data
                //* into Bundle in (key, value) pai
                Bundle bundle = new Bundle();
                bundle.putString("song_name",songs.getSongName());
                bundle.putString("artist_name", songs.getArtistName());


                // Send bundle through Intent
                intent.putExtras(bundle);
                // Start activity
                startActivity(intent);
            }
        });*/

    }
}

