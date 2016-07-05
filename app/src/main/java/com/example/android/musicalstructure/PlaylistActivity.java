package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        TextView recent = (TextView) findViewById(R.id.recent);


        recent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent recentIntent = new Intent(PlaylistActivity.this, RecentActivity.class);
                startActivity(recentIntent);
            }
        });

        TextView frequent = (TextView) findViewById(R.id.frequent);


        frequent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent frequentIntent = new Intent(PlaylistActivity.this, FrequentActivity.class);
                startActivity(frequentIntent);
            }
        });
    }
}
