package com.djjjonas.pokemonapi.domains.pokemon.infrastructure.database;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.djjjonas.pokemonapi.domains.pokemon.core.Pokemon;
import com.djjjonas.pokemonapi.domains.pokemon.core.PokemonRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PokeAPIRepository implements PokemonRepository {

    private WebClient webClientPokemon;

    @Override
    public Pokemon getPokemon(String nameOrId) {
        var monoPokemon = this.webClientPokemon
                .method(HttpMethod.GET)
                .uri("/pokemon/{nameOrId}", nameOrId)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Pokemon.class);

        return monoPokemon.block();
    }

}
