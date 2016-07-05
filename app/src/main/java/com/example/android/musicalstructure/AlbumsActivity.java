package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        TextView purpose = (TextView) findViewById(R.id.purpose);


        purpose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent purposeIntent = new Intent(AlbumsActivity.this, PurposeActivity.class);
                startActivity(purposeIntent);
            }
        });

        TextView views = (TextView) findViewById(R.id.views);


        views.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent viewsIntent = new Intent(AlbumsActivity.this, ViewsActivity.class);
                startActivity(viewsIntent);
            }
        });

        TextView x = (TextView) findViewById(R.id.x);


        x.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent xIntent = new Intent(AlbumsActivity.this, XxActivity.class);
                startActivity(xIntent);
            }
        });
    }





}
