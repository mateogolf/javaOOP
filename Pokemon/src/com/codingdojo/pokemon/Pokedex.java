package com.codingdojo.pokemon;

public class Pokedex extends Actions {
//	public static void main(String[] args) {
//		
//	}
//	Create a Pokedex class that extends the abstract class above and implements pokemonInfo(Pokemon pokemon).
//	pokemonInfo(Pokemon pokemon): returns the name, health, and type of the pokemon
	public Object[] pokemonInfo(Pokemon pokemon) {
		Object[] info = new Object[3];
		info[0] = pokemon.getName();
		System.out.println("Name:" + info[0]);
		info[1] = pokemon.getHealth();
		System.out.println("Health:" + info[1]);
		info[2] = pokemon.getType();
		System.out.println("Type:" + info[2]);
		return info;
	}

}
