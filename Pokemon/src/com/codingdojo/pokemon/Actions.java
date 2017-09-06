package com.codingdojo.pokemon;

public abstract class Actions implements Menu{
//	Create an abstract class that only implements createPokemon and attackPokemon
	//createPokemon(String name, String type, int health): creates a Pokemon.
	public Pokemon createPokemon(String name, int health,String type) {
		Pokemon pokemon = new Pokemon(name,health,type);
		return pokemon;
	}
	//attackPokemon(Pokemon pokemon): lowers the attacked Pokemon's health by 10
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth()-10); 
	}
}
