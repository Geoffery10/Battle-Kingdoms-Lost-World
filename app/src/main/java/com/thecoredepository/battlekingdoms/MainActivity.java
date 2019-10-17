package com.thecoredepository.battlekingdoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View Elements
        Button btnPlayGame = findViewById(R.id.btnPlayGame);
        Button btnSettings = findViewById(R.id.btnSettings);

        //Buttons
        btnPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Start Game
                //Open Intent
                //Intent in = new Intent(getApplicationContext(), PlayActivity.class);

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
                //Intent in = new Intent(getApplicationContext(), SettingsActivity.class);

                //Temp Code
                Toast toast = Toast.makeText(getApplicationContext(), "Feature is not yet available.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
