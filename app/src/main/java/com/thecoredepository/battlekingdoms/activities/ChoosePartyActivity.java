package com.thecoredepository.battlekingdoms.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.battlekingdoms.R;

public class ChoosePartyActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_party);
        fullscreen();

        //View Elements
        Button btnConfirmParty = findViewById(R.id.btnConfirmParty);
        Button btnBackHome = findViewById(R.id.btnBackHome);

        //Buttons
        btnConfirmParty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This Should Open Up the Travel Screen.

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

    private void fullscreen() {
        View overlay = findViewById(R.id.activity_choose_party);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}
