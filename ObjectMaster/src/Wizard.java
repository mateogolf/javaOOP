
public class Wizard extends Human {
	public Wizard() {
		super();
		intelligence = 8;
		health = 50;
	}
	
//	heal(Human) that heals the other human by the wizard's intelligence
	public Human heal(Human target) {
		target.health += intelligence;
		return target;
	}
//	fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
	public void fireball(Human target) {
		target.health -= (intelligence*3);
	}
}
