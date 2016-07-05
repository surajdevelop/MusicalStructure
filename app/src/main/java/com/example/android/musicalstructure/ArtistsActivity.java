package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        TextView drake = (TextView) findViewById(R.id.drake);


        drake.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent purposeIntent = new Intent(ArtistsActivity.this, DrakeActivity.class);
                startActivity(purposeIntent);
            }
        });

        TextView ed = (TextView) findViewById(R.id.ed);


        ed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent viewsIntent = new Intent(ArtistsActivity.this, EdActivity.class);
                startActivity(viewsIntent);
            }
        });

        TextView justin = (TextView) findViewById(R.id.justin);


        justin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent xIntent = new Intent(ArtistsActivity.this, JustinActivity.class);
                startActivity(xIntent);
            }
        });
    }
}
