package com.thecoredepository.battlekingdoms.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.battlekingdoms.R;

public class BattleActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        fullscreen();

        //View Elements
        Button btnAttack = findViewById(R.id.btnAttack);
        Button btnDefend = findViewById(R.id.btnDefend);
        Button btnRun = findViewById(R.id.btnRun);


        //Buttons
        btnAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Attack Continues Turn Order and Applies Damage

            }
        });

        btnDefend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Block Stops All Damage
                //Blocking flag will need to be added to entity

            }
        });

        btnRun.setOnClickListener(new View.OnClickListener() {
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
        View overlay = findViewById(R.id.activity_battle);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}
