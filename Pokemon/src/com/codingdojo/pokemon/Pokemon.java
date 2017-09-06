package com.codingdojo.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
//	a count static variable that keeps the number of Pokemon created in the program.
	public static int counter;
//	a constructor class to set the instance's name, health, and type on creation
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		counter++;
	}
//	getters and setters for each member variable.
	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Health
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	//Type
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

//	Create an interface for the following methods:
//
//	createPokemon(String name, String type, int health): creates a Pokemon.
//	attackPokemon(Pokemon pokemon): lowers the attacked Pokemon's health by 10
//	pokemonInfo(Pokemon pokemon): returns the name, health, and type of the pokemon
//	Create an abstract class that only implements createPokemon and attackPokemon
//	Create a Pokedex class that extends the abstract class above and implements pokemonInfo(Pokemon pokemon).
}
