package com.example.android.musicapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//import static com.example.android.musicapp.NowPlayingActivity.ARG_SONG;

public class SongsAdapter extends BaseAdapter {
    private Context mContext;
    private List<Songs> mSongs;
    private LayoutInflater mInflater;

    public SongsAdapter(Context context, List<Songs> songs) {
        mInflater = LayoutInflater.from(context);
        mContext = context;
        mSongs = songs;
    }

    @Override
    public int getCount() {
        return mSongs.size();
    }

    @Override
    public Object getItem(int position) {
        return mSongs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public void updateData(List<Songs> songs) {
        mSongs = songs;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final View view;
        final ViewHolder holder;
        final Songs currentSong = mSongs.get(position);
        if (convertView == null) {
            view = mInflater.inflate(R.layout.song_list_item, parent, false);
            holder = new ViewHolder();
            holder.songTextView = (TextView) view.findViewById(R.id.song_name);
            holder.songItem = (ConstraintLayout)view.findViewById(R.id.songs_item);
            holder.artistTextView = (TextView) view.findViewById(R.id.song_list_artist);
            view.setTag(holder);
        }
        else{
            view = convertView;
            holder = (ViewHolder) convertView.getTag();
        }

        holder.songTextView.setText(currentSong.getSongName());


        holder.artistTextView.setText(currentSong.getArtistName());
        holder.songItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,currentSong.getSongName(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(mContext,NowPlayingActivity.class);
                intent.putExtra("songNameKey","currentSong.getSongName");
                intent.putExtra("artistNameKey","currentSong.getArtistName");
                mContext.startActivity(intent);

            }
        });
        return view;

    }
    // Return the size of your dataset (invoked by the layout manager)
    public static class ViewHolder {
    TextView songTextView;
    TextView artistTextView;
    ConstraintLayout songItem;
    }
}
