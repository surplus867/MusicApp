package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

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
    // Create new views (invoked by the layout manager)
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final View view;
        final ViewHolder holder;
        final Songs currentSong = mSongs.get(position);
        //If convertView is null create a new view, else use convert view
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
                intent.putExtra("songNameKey",currentSong.getSongName());
                intent.putExtra("artistNameKey",currentSong.getArtistName());
                mContext.startActivity(intent);
                }
        });

        return view;
    }
// Replace the contents of a view (invoked by the layout manager)

// Return the size of your dataSet (invoked by the layout manager)
public static class ViewHolder {

    TextView songTextView;
    TextView artistTextView;
    ConstraintLayout songItem;
}
}
