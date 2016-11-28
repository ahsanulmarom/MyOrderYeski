package com.example.user.myorderyeski;

/**
 * Created by Ahsanul Marom
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class About extends MainPage {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutlayout);
        ImageButton maps = (ImageButton) findViewById (R.id.BtnMaps);

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MapsYeski.class);
                startActivity(i);
            }
        });
    }
}
