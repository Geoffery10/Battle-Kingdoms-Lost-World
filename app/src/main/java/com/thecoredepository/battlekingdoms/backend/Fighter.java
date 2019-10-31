
public class Fighter extends Character {

	public Fighter() {
		super("Frank","Fighter","Human",30,10,2.0,5.0,2);
	}
	
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
