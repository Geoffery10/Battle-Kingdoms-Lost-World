package com.thecoredepository.battlekingdoms.backend;

//This class outlines the basic values and functions all entities have whether they be player or mob.

import java.util.ArrayList;

public class Entity
{
	//hi
	
    //Attributes of an Entity
    String name; //The name of the entity i.e. Marth, Roy, Billy the Angry Goblin
    String race; //The entity's race i.e. Human, Goblin, Robot...
    String type; //Character or Mob
    int health; //Total Health
    int damage; //Total Damage (This is subtracted from health)
    int magic; //Total Magic Points the entity has
    int drain; //Total Drain (This is subtracted from magic)
    int turn;
    //Attack, Defence, and Speed can be modifiers to rolls i.e. Attack = 1.5x
    double attack; //This is the entity's attack stat which increases damage rolls
    double defence; //This is the entity's defence stat which reduces damage taken
    double speed; //This is the entity's speed stat which effects initiative rolls

    //Magic
    //Magic can be added in later in development
    //ArrayList spells = new ArrayList(); //List of Spells Available to use

    
}
