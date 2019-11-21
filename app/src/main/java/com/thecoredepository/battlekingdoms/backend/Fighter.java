package com.thecoredepository.battlekingdoms.backend;

//i will add more stuff like a skill list
//DONT JUDGE FRANK ON HOW BARE HE IS
public class Fighter extends Character {

	public Fighter() {

		super("Frank","Fighter","Human",30,10,2.0,5.0,2);
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
