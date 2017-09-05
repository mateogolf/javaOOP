package com.codingdojo.zookeeper;

public class DragonTest {
	public static void main(String[] args) {
		Dragon draco = new Dragon();
//		attack three towns, eat two humans, and fly twice.
		draco.attackTown();
		draco.attackTown();
		draco.attackTown();
		draco.eatHumans();
		draco.eatHumans();
		draco.fly();
		draco.fly();
		draco.displayEnergy();
		
	}
}
