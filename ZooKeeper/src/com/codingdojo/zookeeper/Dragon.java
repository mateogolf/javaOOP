package com.codingdojo.zookeeper;

public class Dragon extends Mammal {
	private int energyLevel = 300;
	
//	For the fly() method, print the sound a dragon taking off and decrease its energy by 50.
	public void fly() {
		System.out.println("I believe I can fly--no, really--I'm flying bitches!");
		energyLevel -= 50;
	}
//	For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
	public void eatHumans() {
		System.out.println("*CRUNCH!* Yummy Humans!");
		energyLevel += 25;
	}
//	For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
	public void attackTown() {
		System.out.println("Burn, baby. BURN!!!!");
		energyLevel -= 100;
	}
}
