
public class Character extends Entity{

	//skill list needed to be added. probably an object array.
	
	//all the same variables as Entity for now
	public Character(String name, String race, int health, int magic, double attack, double defence, double speed) {
		super();
		this.name = name;
		this.race = race;
		type = "Character";
	    this.health = health;
        this.magic = magic;
	    this.attack = attack;
	    this.defence = defence;
	    this.speed = speed;
	}
	
	
}
