package com.djjjonas.pokemonapi.domains.item.application.query;

import com.djjjonas.pokemonapi.domains.item.core.PokeItem;
import com.djjjonas.pokemonapi.domains.item.core.PokeItemRepository;

import lombok.AllArgsConstructor;
import tech.rocketwave.airway.query.QueryHandler;

@AllArgsConstructor
public class GetPokeItemByNameOrIdQueryHandler implements QueryHandler<GetPokeItemByNameOrIdQuery, PokeItem> {

    private PokeItemRepository repository;

    @Override
    public PokeItem handle(GetPokeItemByNameOrIdQuery query) {
        return repository.getPokeItem(query.nameOrId);
    }

}
