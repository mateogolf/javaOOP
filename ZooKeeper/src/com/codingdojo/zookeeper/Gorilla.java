package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	//throw() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5
	public void chuck() {
		System.out.println("Gorilla has thrown something");
		energyLevel -= 5;
	}

	//For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
	public void eatBananas() {
		System.out.println("Gorilla farts loudly after eating a banana.");
		energyLevel += 10;
	}

	//For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
	public void climb() {
		System.out.println("Gorilla has climbed to new heights...literally...up a tree.");
		energyLevel -= 10;
	}
}
