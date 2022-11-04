package com.djjjonas.pokemonapi.domains.pokemon.application.query;

import com.djjjonas.pokemonapi.domains.pokemon.core.Pokemon;

import lombok.AllArgsConstructor;
import tech.rocketwave.airway.query.Query;

@AllArgsConstructor
public class GetPokemonByNameOrIdQuery implements Query<Pokemon> {
    public String nameOrId;
}
