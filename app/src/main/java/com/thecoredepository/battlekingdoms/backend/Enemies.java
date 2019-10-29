package com.thecoredepository.battlekingdoms.backend;

import com.thecoredepository.battlekingdoms.backend.Entity;

public class Enemies extends Entity {

	//basic constructor that calls on the super class
	//has all the same variables except magic
	public Enemies(String name, String race, int health, double attack, double defence, double speed) {
		super();
		this.name = name;
		this.race = race;
		this.type = "Enemy";
	    this.health = health;
	    this.attack = attack;
	    this.defence = defence;
	    this.speed = speed;
	}

}
