package com.codingdojo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex p = new Pokedex();
		Pokemon c = p.createPokemon("Charizard",50,"Fire");
		Pokemon bulba = p.createPokemon("Bulbasaur", 50, "Poison/Grass");
		Pokemon sq = p.createPokemon("Squirtle", 50, "Water");
		p.attackPokemon(c);
		p.pokemonInfo(c);
		System.out.println(Pokemon.counter);
		
	}

}
