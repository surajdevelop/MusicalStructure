package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        TextView song = (TextView) findViewById(R.id.songs);


        song.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);


        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumIntent);
            }
        });

        TextView artist = (TextView) findViewById(R.id.artist);

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        TextView playlist = (TextView) findViewById(R.id.playlist);


        playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }


}