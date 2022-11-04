package com.djjjonas.pokemonapi.domains.pokemon.application.query;

import com.djjjonas.pokemonapi.domains.pokemon.core.Pokemon;
import com.djjjonas.pokemonapi.domains.pokemon.infrastructure.database.PokeAPIRepository;

import lombok.AllArgsConstructor;
import tech.rocketwave.airway.query.QueryHandler;

@AllArgsConstructor
public class GetPokemonByNameOrIdQueryHandler implements QueryHandler<GetPokemonByNameOrIdQuery, Pokemon> {

    private PokeAPIRepository pokeAPIRepository;

    @Override
    public Pokemon handle(GetPokemonByNameOrIdQuery query) {
        return pokeAPIRepository.getPokemon(query.nameOrId);
    }

}
