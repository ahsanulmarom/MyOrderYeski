package com.example.user.orderyeski;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        final Context context = this;

        ImageButton belisekarang = (ImageButton) findViewById(R.id.belisekarang);
        belisekarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MenuMuka.class);
                startActivity(i);
            }
        });
    }
}
