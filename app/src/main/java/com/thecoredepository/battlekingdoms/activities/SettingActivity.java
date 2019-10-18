package com.thecoredepository.battlekingdoms.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.battlekingdoms.MainActivity;
import com.thecoredepository.battlekingdoms.R;

public class SettingActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //View Elements
        Button btnCredits = findViewById(R.id.btnCredits);
        Button btnBackHome = findViewById(R.id.btnBackHome);

        //Buttons
        btnCredits.setOnClickListener(new View.OnClickListener() {
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
}
