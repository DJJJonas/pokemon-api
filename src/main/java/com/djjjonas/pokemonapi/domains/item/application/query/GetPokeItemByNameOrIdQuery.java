package com.djjjonas.pokemonapi.domains.item.application.query;

import com.djjjonas.pokemonapi.domains.item.core.PokeItem;

import lombok.AllArgsConstructor;
import tech.rocketwave.airway.query.Query;

@AllArgsConstructor
public class GetPokeItemByNameOrIdQuery implements Query<PokeItem> {
    public String nameOrId;
}
