
public class Human {
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	public Human attack(Human target){
		target.health -= strength;
		return target;
	}
	public void displayHealth() {
		System.out.println(health);
	}
}
