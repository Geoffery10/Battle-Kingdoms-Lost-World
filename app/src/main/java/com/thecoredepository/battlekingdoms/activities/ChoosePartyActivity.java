package com.thecoredepository.battlekingdoms.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.battlekingdoms.R;

public class ChoosePartyActivity extends AppCompatActivity
{
    //Global
    private int selectionCount = 4; //This should be zero

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_party);
        fullscreen();

        //View Elements
        continueAndBack();
    }

    private void continueAndBack() {
        Button btnConfirmParty = findViewById(R.id.btnConfirmParty);
        Button btnBackHome = findViewById(R.id.btnBackHome);

        //Buttons
        btnConfirmParty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean validParty = true;

                //Check for valid party
                if (selectionCount == 4) {
                    validParty = true;
                } else {
                    validParty = false;
                }

                if (validParty == true) {
                    //Save party

                    //Open Up the Travel Screen
                    //Open Intent
                    Intent in = new Intent(getApplicationContext(), TravelMapActivity.class);
                    startActivity(in);
                }

            }
        });

        btnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Go back to main
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
