package com.thecoredepository.battlekingdoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.thecoredepository.battlekingdoms.activities.ChoosePartyActivity;
import com.thecoredepository.battlekingdoms.activities.SettingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullscreen();

        //View Elements

        //Buttons
        buttons();
    }

    private void buttons() {
        Button btnPlayGame = findViewById(R.id.btnPlayGame);
        Button btnQuitGame = findViewById(R.id.btnQuitGame);
        Button btnSettings = findViewById(R.id.btnSettings);

        //Buttons
        btnPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Start Game
                //This Should Open Up the Party Select Screen.
                //Open Intent
                Intent in = new Intent(getApplicationContext(), ChoosePartyActivity.class);
                startActivity(in);
            }
        });

        btnQuitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Do any saving here before shutdown!

                //Quit Game
                finish();
                System.exit(0);
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

    private void fullscreen() {
        View overlay = findViewById(R.id.activity_main);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}
