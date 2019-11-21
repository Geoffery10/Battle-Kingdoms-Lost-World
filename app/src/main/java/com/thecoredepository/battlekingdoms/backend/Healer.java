package com.thecoredepository.battlekingdoms.backend;

public class Healer extends Character {

	public Healer() {
		super("Henry","Healer","Dwarf",15,30,1.0,3.0,2, 4);
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