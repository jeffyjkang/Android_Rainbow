package com.example.introtoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonDemo;
    ConstraintLayout layoutBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutBackground = findViewById(R.id.layout_background);
        buttonDemo = findViewById(R.id.button_demo);
        buttonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Demo", "The demo button was clicked!");
                layoutBackground.setBackgroundColor(getResources().getColor(R.color.design_default_color_primary_dark));
            }
        });
    }
}