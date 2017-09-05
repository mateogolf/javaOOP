
public class Samurai extends Human {
	public static int counter = 0;
	public Samurai() {
		super();
		health = 200;
		counter++;
	}
	
//	deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
	public void dealthBlow(Human target) {
		health/=2;
		target.health = 0;
		if(target instanceof Samurai) {
			counter--;
		}
	}

//	meditate() that heals the Samurai for half of their current health.
	public void meditate() {
		health += (health/2);
	}

//	howMany() that returns the total current number of Samurai.
	public static int howMany() {
		return counter;
	}
}
