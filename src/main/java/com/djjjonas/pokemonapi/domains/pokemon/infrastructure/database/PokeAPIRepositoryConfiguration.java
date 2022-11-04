package com.djjjonas.pokemonapi.domains.pokemon.infrastructure.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class PokeAPIRepositoryConfiguration {
    @Bean
    public PokeAPIRepository pokeAPIRepository(WebClient webClientPokemon) {
        return new PokeAPIRepository(webClientPokemon);
    }
}
