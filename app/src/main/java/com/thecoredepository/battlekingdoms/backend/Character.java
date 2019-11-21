package com.thecoredepository.battlekingdoms.backend;

import com.thecoredepository.battlekingdoms.backend.Entity;

public class Character extends Entity {

	private String name;
	private String charClass;
	private String race;
	private int health;
	private int magic;
	private double attack;
	private double defence;
	private double speed;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public double getDefence() {
		return defence;
	}

	public void setDefence(double defence) {
		this.defence = defence;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
