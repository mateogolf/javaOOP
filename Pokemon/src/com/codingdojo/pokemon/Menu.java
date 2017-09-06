package com.codingdojo.pokemon;

public interface Menu {
	Pokemon createPokemon(String name, int health, String type);
	void attackPokemon(Pokemon pokemon);
	Object[] pokemonInfo(Pokemon pokemon);
//	createPokemon(String name, String type, int health): creates a Pokemon.
//	attackPokemon(Pokemon pokemon): lowers the attacked Pokemon's health by 10
//	pokemonInfo(Pokemon pokemon): returns the name, health, and type of the pokemon
}
