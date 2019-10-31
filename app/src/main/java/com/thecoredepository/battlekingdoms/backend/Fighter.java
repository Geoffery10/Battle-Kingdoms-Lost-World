//i will add more stuff like a skill list 
//DONT JUDGE FRANK ON HOW BARE HE IS
public class Fighter extends Character {

	public Fighter() {
		super("Frank","Fighter","Human",30,10,2.0,5.0,2);
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
