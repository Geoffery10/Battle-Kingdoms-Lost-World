package com.thecoredepository.battlekingdoms.backend;

import com.thecoredepository.battlekingdoms.backend.Entity;

public class Enemy extends Entity {

	private String name;
	private String race;
	private int health;
	private int magic;
	private double attack;
	private double defence;
	private double speed;
	private int icon;

	//all the same variables as Entity for now
	public Enemy() {
		this.name = "BLANK";
		this.race = "HUMAN";
		this.type = "Character";
		this.health = 1;
		this.magic = 1;
		this.attack = 1;
		this.defence = 1;
		this.speed = 1;
		this.icon = 1;
	}

	public Enemy(String name, String race, int health, int magic, double attack, double defence, double speed, int icon) {
		super();
		this.name = name;
		this.race = race;
		this.type = "Character";
		this.health = health;
		this.magic = magic;
		this.attack = attack;
		this.defence = defence;
		this.speed = speed;
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

}
