package com.thecoredepository.battlekingdoms.backend;

import java.util.Random;

//This class is designed to manage Dice rolls and apply entity modifiers

public class Dice
{
    //Attributes of Dice
    //2d8 = (numOfDice=2)d(valueOfDice=8)
    Random rand =new Random();
	int numOfDice;
    int valueOfDice;
   // double multiplier; //i.e. 1.5x
    double result; //i.e. Attack damage after roll and modifier

    public Dice(int numOfDice, int valueOfDice) {
    	this.numOfDice = numOfDice;
    	this.valueOfDice = valueOfDice;
    	result = 0;
    }
    
    //getters
    public int getNumOfDice() {
		return numOfDice;
	}

	public int getValueOfDice() {
		return valueOfDice;
	}
    
	//getter for result of dice. uses while loop to "roll" each dice
	public double getResult() {
		int x = 0;
		result = 0;
		
		while (x<numOfDice) {
			int randVal = rand.nextInt(valueOfDice);
		    result += randVal+1;
		    x++;
		}
		return result;
	}
    
}