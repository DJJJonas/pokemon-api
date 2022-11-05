package com.djjjonas.pokemonapi.domains.item.infrastructure.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import com.djjjonas.pokemonapi.domains.item.core.PokeItemRepository;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class PokeItemAPIRepositoryConfiguration {
    @Bean
    public PokeItemRepository pokeItemAPIRepository(WebClient webClientPokeItem) {
        return new PokeItemAPIRepository(webClientPokeItem);
    }
}
