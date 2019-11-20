public class Knight extends Character {

	public Knight() {
		super("Nellson","Knight","Dragonborn",50,5,5.0,10.0,1);
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