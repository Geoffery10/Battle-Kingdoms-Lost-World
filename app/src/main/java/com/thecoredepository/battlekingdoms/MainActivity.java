package com.thecoredepository.battlekingdoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.thecoredepository.battlekingdoms.activities.SettingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View Elements
        Button btnPlayGame = findViewById(R.id.btnPlayGame);
        Button btnSettings = findViewById(R.id.btnSettings);

        View overlay = findViewById(R.id.activity_main);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN);

        //Buttons
        btnPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Start Game
                //Open Intent
                //Intent in = new Intent(getApplicationContext(), PlayActivity.class);
                //startActivity(in);

                //Temp Code
                Toast toast = Toast.makeText(getApplicationContext(), "Feature is not yet available.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open Settings Menu
                //Open Intent
                Intent in = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(in);

            }
        });
    }
}
