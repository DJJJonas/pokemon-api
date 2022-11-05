package com.djjjonas.pokemonapi.domains.item.infrastructure.database;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.djjjonas.pokemonapi.domains.item.core.PokeItem;
import com.djjjonas.pokemonapi.domains.item.core.PokeItemRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PokeItemAPIRepository implements PokeItemRepository {

    private WebClient webClientPokemon;

    @Override
    public PokeItem getPokeItem(String nameOrId) {
        var monoPokeItem = this.webClientPokemon
                .method(HttpMethod.GET)
                .uri("/item/{nameOrId}", nameOrId)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(PokeItem.class);

        return monoPokeItem.block();
    }

}
