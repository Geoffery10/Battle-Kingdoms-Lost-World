public class Sharpshooter extends Character {

	public Sharpshooter() {
		super("Shelly","Sharpshooter","Kenku",15,20,3.0,2.0,2);
	}
	//this was just to test
	void printStats() {
		System.out.println(get_name());
		System.out.println(get_race());
		System.out.println(get_type());
		System.out.println(get_health());
		System.out.println(get_magic());
		System.out.println(get_attack());
		System.out.println(get_defense());
		System.out.println(get_speed());
		System.out.println();
		
	}
	
}