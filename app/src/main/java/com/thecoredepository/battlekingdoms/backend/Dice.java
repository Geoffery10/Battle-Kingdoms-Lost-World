package com.thecoredepository.battlekingdoms.backend;

//This class is designed to manage Dice rolls and apply entity modifiers

public class Dice
{
    //Attributes of Dice
    //2d8 = (numOfDice=2)d(valueOfDice=8)
    int numOfDice;
    int valueOfDice;
    double multiplier; //i.e. 1.5x
    double result; //i.e. Attack damage after roll and modifier
}
