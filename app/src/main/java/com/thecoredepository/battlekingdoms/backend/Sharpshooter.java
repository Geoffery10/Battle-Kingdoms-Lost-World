package com.thecoredepository.battlekingdoms.backend;

public class Sharpshooter extends Character {

	public Sharpshooter() {
		super("Shelly","Sharpshooter","Kenku",15,20,3.0,2.0,2, 3);
	}
	//this was just to test
	void printStatsToConsole() {
		//This function is only for testing
		System.out.println(getName() + "\n");
		System.out.println(getCharClass() + "\n");
		System.out.println(getRace() + "\n");
		System.out.println(getHealth() + "\n");
		System.out.println(getMagic() + "\n");
		System.out.println(getAttack() + "\n");
		System.out.println(getDefence() + "\n");
		System.out.println(getSpeed() + "\n");
	}
	
}