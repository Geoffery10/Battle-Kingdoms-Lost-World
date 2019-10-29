package com.thecoredepository.battlekingdoms.backend;

import com.thecoredepository.battlekingdoms.backend.Entity;

public class Character extends Entity {

	String charClass; //Fighter, Healer, Wizard...
	//skill list needed to be added. probably an object array.
	
	//all the same variables as Entity for now
	public Character(String name, String charClass, String race, int health, int magic, double attack, double defence, double speed) {
		super();
		this.name = name;
		this.charClass = charClass;
		this.race = race;
		this.type = "Character";
	    this.health = health;
        this.magic = magic;
	    this.attack = attack;
	    this.defence = defence;
	    this.speed = speed;
	}
	
	
}
