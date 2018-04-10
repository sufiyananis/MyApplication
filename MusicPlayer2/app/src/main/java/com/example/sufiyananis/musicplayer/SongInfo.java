package com.example.sufiyananis.musicplayer;

/**
 * Created by Sufiyan Anis on 2/18/2018.
 */

public class SongInfo {

    public String songName,artistName,songUrl;

    public SongInfo(){

    }
    public SongInfo(String songName,String artistName,String songUrl){
        this.songName=songName;
        this.artistName=artistName;
        this.songUrl=songUrl;
    }
    public String getSongName(){
        return songName;
    }
    public String getArtistNme(){
        return artistName;
    }
    public String getSongUrl(){
        return songUrl;
    }
}
