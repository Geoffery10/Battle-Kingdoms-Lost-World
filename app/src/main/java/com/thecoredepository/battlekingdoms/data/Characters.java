package com.thecoredepository.battlekingdoms.data;

import android.graphics.drawable.Drawable;

import com.thecoredepository.battlekingdoms.R;
import com.thecoredepository.battlekingdoms.backend.Character;

import java.util.ArrayList;

public class Characters
{
    private ArrayList<Character> characters = new ArrayList<Character>();
    private Character Frank = new Character("Frank","Fighter","Human",30,10,2.0,5.0,2, 6); //Fighter
    private Character Tracy = new Character("Tracy","Trickster","Elfling",15,20,3.0,5.0,1, 2); //Trickster
    private Character Henry = new Character("Henry","Healer","Dwarf",15,30,1.0,3.0,2, 4); //Healer
    private Character Kellen = new Character("Kellen","Knight","Dragonborn",50,5,5.0,10.0,1, 1); //Knight
    private Character Shelly = new Character("Shelly","Sharpshooter","Kenku",15,20,3.0,2.0,2, 3); //Sharpshooter


    public void intializeCharacters() {
        characters.add(Frank);
        characters.add(Tracy);
        characters.add(Henry);
        characters.add(Kellen);
        characters.add(Shelly);
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }
}
