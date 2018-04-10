package com.example.sufiyananis.musicplayer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Sufiyan Anis on 2/18/2018.
 */

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongHolder> {
    ArrayList<SongInfo> song;
    Context context;

    OnitemClickListener onitemClickListener;

    SongAdapter(Context context,ArrayList<SongInfo> song){
        this.context=context;
        this.song=song;

    }
    public interface OnitemClickListener{
        void onItemClick(Button b, View v, SongInfo obj, int position);
    }

    public void setOnitemClickListener(OnitemClickListener onitemClickListener){
    this.onitemClickListener = onitemClickListener;
    }

    @Override
    public SongHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View myview = LayoutInflater.from(context).inflate(R.layout.row_song,viewGroup,false);
        return new SongHolder(myview);
    }

    @Override
    public void onBindViewHolder(final SongHolder holder, final int i) {
  final   SongInfo c = song.get(i);
    holder.songName.setText(c.songName);
        holder.artistName.setText(c.artistName);
        holder.btnAction.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(onitemClickListener!=null){
                    onitemClickListener.onItemClick(holder.btnAction,v,c,i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return song.size();
    }

    public class SongHolder extends RecyclerView.ViewHolder {
        TextView songName,artistName;
        Button btnAction;
        public SongHolder(View itemView) {
            super(itemView);
            songName = (TextView) itemView.findViewById(R.id.tvsongName);
            artistName = (TextView) itemView.findViewById(R.id.tvartistName);
            btnAction = (Button) itemView.findViewById(R.id.btnAction);
        }
    }
}
