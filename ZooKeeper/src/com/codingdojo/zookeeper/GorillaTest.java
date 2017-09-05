package com.codingdojo.zookeeper;

public class GorillaTest {
	public static void main(String[] args) {
		//Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.
		Gorilla joeYoung = new Gorilla();
		joeYoung.chuck();
		joeYoung.chuck();
		joeYoung.chuck();
		joeYoung.eatBananas();
		joeYoung.eatBananas();
		joeYoung.climb();
		joeYoung.displayEnergy();
	}
}
