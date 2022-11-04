package com.djjjonas.pokemonapi.domains.pokemon.infrastructure.query;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.djjjonas.pokemonapi.domains.pokemon.application.query.GetPokemonByNameOrIdQuery;
import com.djjjonas.pokemonapi.domains.pokemon.application.query.GetPokemonByNameOrIdQueryHandler;
import com.djjjonas.pokemonapi.domains.pokemon.infrastructure.database.PokeAPIRepository;

import lombok.AllArgsConstructor;
import tech.rocketwave.airway.Airway;

@Configuration
@AllArgsConstructor
public class GetPokemonByNameOrIdQueryHandlerConfiguration {
    private final PokeAPIRepository pokeAPIRepository;
    private final Airway airway;

    @Bean
    public GetPokemonByNameOrIdQueryHandler getPokemonByNameOrIdQueryHandler() {
        var handler = new GetPokemonByNameOrIdQueryHandler(pokeAPIRepository);
        airway.register(GetPokemonByNameOrIdQuery.class, handler);
        return handler;
    }
}
