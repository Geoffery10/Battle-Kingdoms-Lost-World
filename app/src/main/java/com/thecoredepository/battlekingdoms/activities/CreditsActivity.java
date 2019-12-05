package com.thecoredepository.battlekingdoms.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.battlekingdoms.R;

public class CreditsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        fullscreen();

        //View Elements
        ImageView imgDev01 = findViewById(R.id.imgDev01);
        ImageView imgDev02 = findViewById(R.id.imgDev02);

        //Set images
        imgDev01.setImageResource(R.drawable.dev_01);
        imgDev02.setImageResource(R.drawable.dev_02);

        //Buttons
        buttons();
    }

    private void buttons() {
        Button btnBackHome = findViewById(R.id.btnBackHome);
        btnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void fullscreen() {
        View overlay = findViewById(R.id.activity_settings);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}