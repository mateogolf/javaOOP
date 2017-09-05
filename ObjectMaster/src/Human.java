
public class Human {
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	public Human() {
		this(3, 3, 3,100);
	}
	public Human(int strength, int stealth, int intelligence) {
		this(strength, stealth, intelligence,100);
	}
	public Human(int strength, int stealth, int intelligence, int health) {
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}
	public Human attack(Human target){
		target.health -= strength;
		return target;
	}
	public void displayHealth() {
		System.out.println(health);
	}
	public void displayStats() {
		System.out.println(this.getClass().getName());
		System.out.println("Health:" + health);
		System.out.println("Strength:" + strength);
		System.out.println("Intelligence:" + intelligence);
		System.out.println("Stealth:" + stealth);
	}
}
