package com.thecoredepository.battlekingdoms.backend;

public class Trickster extends Character {

	public Trickster() {
		super("Tracy","Trickster","Elfling",15,20,3.0,5.0,1, 2);
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