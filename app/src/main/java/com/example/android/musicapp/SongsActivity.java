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

//import static com.example.android.musicapp.NowPlayingActivity.ARG_SONG;

public class SongsActivity extends AppCompatActivity {
    ListView listView;
    SongsAdapter adapter;
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



                //songsList.add(song1);
                //songsList.add(song2);


                 adapter = new SongsAdapter(this, songsList);
                 listView.setAdapter(adapter);
                //adapter.updateData(songsList);
        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View  view, int position, long l) {
                Songs songs = songsList.get(position);

                Intent intent = new  Intent(getBaseContext(),NowPlayingActivity.class);
                intent.putExtra("songNameKey","Song Name");
                intent.putExtra("artistNameKey","Artist Name");
                startActivity(intent);

            }
        });*/

            }
        }




