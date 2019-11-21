package com.thecoredepository.battlekingdoms.backend;

public class Knight extends Character {

	public Knight() {
		super("Nellson","Knight","Dragonborn",50,5,5.0,10.0,1, 1);
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