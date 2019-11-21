package com.thecoredepository.battlekingdoms.backend;

public class Skills {

	//base parent class for skills
	//has three variables for name, effect, and effect number

	//effect number will be related to any stat effects that the 
	//effect may have
	String name;
	String effect;
	double effectNumber;
	
	//constructor
	public Skills() {
		name = "null";
		effect = "null";
		effectNumber = 0;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getEffect() {
		return effect;
	}

	public double getEffectNumber() {
		return effectNumber;
	}	
	
}
