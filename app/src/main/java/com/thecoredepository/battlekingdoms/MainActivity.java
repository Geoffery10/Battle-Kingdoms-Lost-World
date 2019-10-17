package com.thecoredepository.battlekingdoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View Elements
        Button btnPlayGame = findViewById(R.id.btnPlayGame);

        //Buttons
        btnPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Start Game
                //Open Intent
                //Intent in = new Intent(getApplicationContext(), OLSheetActivity.class);
            }
        });
    }
}
