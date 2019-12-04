package com.thecoredepository.battlekingdoms.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.thecoredepository.battlekingdoms.R;

import java.util.Random;

import static com.thecoredepository.battlekingdoms.activities.ChoosePartyActivity.party;

public class BattleActivity extends AppCompatActivity
{
    public int turnIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        fullscreen();

        //View Elements
        Button btnAttack = findViewById(R.id.btnAttack);
        Button btnDefend = findViewById(R.id.btnDefend);
        Button btnRun = findViewById(R.id.btnRun);



        //ENCOUNTER START!!!
        boolean canContinue = true;
        turnIndex = new Random().nextInt(party.size());

        //Load first character into place by random
        updateCharacter(turnIndex);


        //Buttons
        btnAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Attack Continues Turn Order and Applies Damage

                updateTurn();

            }
        });

        btnDefend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Block Stops All Damage
                //Blocking flag will need to be added to entity

                updateTurn();
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

    private void updateTurn() {
        //Update Turn
        if (turnIndex == (party.size() - 1)) {
            turnIndex = 0;
        } else {
            turnIndex = turnIndex + 1;
        }
        updateCharacter(turnIndex);
    }

    private void updateCharacter(int index) {
        ImageView img_party = findViewById(R.id.img_party);
        TextView txtNamePlate = findViewById(R.id.txtNamePlate);
        TextView txtAttack = findViewById(R.id.txtAttack);
        TextView txtDefense = findViewById(R.id.txtDefense);
        TextView txtSpeed = findViewById(R.id.txtSpeed);
        TextView txtMagic = findViewById(R.id.txtMagic);
        TextView txtClass = findViewById(R.id.txtClass);

        Drawable icon = getIcon(party.get(index).getIcon());
        img_party.setImageDrawable(icon);
        txtNamePlate.setText(""+party.get(index).getName());
        txtAttack.setText(""+party.get(index).getAttack());
        txtDefense.setText(""+party.get(index).getDefence());
        txtSpeed.setText(""+party.get(index).getSpeed());
        txtMagic.setText(""+party.get(index).getMagic());
        txtClass.setText("Class: "+party.get(index).getCharClass());
    }

    public Drawable getIcon(int id) {
        Drawable icon = getDrawable(R.drawable.character_silhouette_00);
        switch(id) {
            case 1:
                icon = getDrawable(R.drawable.character_silhouette_01);
                break;
            case 2:
                icon = getDrawable(R.drawable.character_silhouette_02);
                break;
            case 3:
                icon = getDrawable(R.drawable.character_silhouette_03);
                break;
            case 4:
                icon = getDrawable(R.drawable.character_silhouette_04);
                break;
            case 5:
                icon = getDrawable(R.drawable.character_silhouette_05);
                break;
            case 6:
                icon = getDrawable(R.drawable.character_silhouette_06);
                break;
            case 7:
                icon = getDrawable(R.drawable.character_silhouette_07);
                break;
            case 8:
                icon = getDrawable(R.drawable.character_silhouette_08);
                break;
            case 9:
                icon = getDrawable(R.drawable.character_silhouette_09);
                break;
            case 10:
                icon = getDrawable(R.drawable.character_silhouette_10);
                break;
            case 11:
                icon = getDrawable(R.drawable.character_silhouette_11);
                break;
            case 12:
                icon = getDrawable(R.drawable.character_silhouette_12);
                break;
        }
        return icon;
    }

    private void fullscreen() {
        View overlay = findViewById(R.id.activity_battle);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}
