package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Find the View that shows the songs category
        TextView songsTextView= (TextView) findViewById(R.id.songs_text_view);
        // Set a click listener on that View
        songsTextView.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                // Create a new intent to open the {@link SongsActivity}
                Intent intent = new Intent(MainActivity.this,SongsActivity.class);
                //// Start the new activity
                startActivity(intent);
            }
        });

    }
}
