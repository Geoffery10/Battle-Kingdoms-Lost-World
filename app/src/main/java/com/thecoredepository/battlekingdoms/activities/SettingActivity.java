package com.thecoredepository.battlekingdoms.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.battlekingdoms.BuildConfig;
import com.thecoredepository.battlekingdoms.MainActivity;
import com.thecoredepository.battlekingdoms.R;

public class SettingActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        fullscreen();

        //View Elements
        TextView txtVersion = findViewById(R.id.txtVersion);

        String versionName = BuildConfig.VERSION_NAME;
        txtVersion.setText("Version: " + versionName);

        //Buttons
        buttons();
    }

    private void buttons() {
        Button btnCredits = findViewById(R.id.btnCredits);
        Button btnBackHome = findViewById(R.id.btnBackHome);
        btnCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open Intent
                Intent in = new Intent(getApplicationContext(), CreditsActivity.class);
                startActivity(in);
            }
        });

        btnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open Settings Menu
                //Open Intent
                //Intent in = new Intent(getApplicationContext(), MainActivity.class);
                //startActivity(in);

                //Close Settings
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
