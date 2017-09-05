
public class MasterTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Team 1
		Human h1 = new Human();
		Wizard w1 = new Wizard();
		Ninja n1 = new Ninja();
		Samurai s1a = new Samurai();
		Samurai s1b = new Samurai();
		//Team 2
		Wizard w2 = new Wizard();
		Ninja n2 = new Ninja();
		Samurai s2 = new Samurai();
		
		System.out.println(Samurai.howMany());
		s2.dealthBlow(s1b);
		System.out.println(Samurai.howMany());
	}
}
