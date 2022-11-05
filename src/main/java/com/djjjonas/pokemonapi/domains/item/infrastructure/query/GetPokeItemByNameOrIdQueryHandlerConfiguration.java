package com.djjjonas.pokemonapi.domains.item.infrastructure.query;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.djjjonas.pokemonapi.domains.item.application.query.GetPokeItemByNameOrIdQuery;
import com.djjjonas.pokemonapi.domains.item.application.query.GetPokeItemByNameOrIdQueryHandler;
import com.djjjonas.pokemonapi.domains.item.core.PokeItemRepository;

import lombok.AllArgsConstructor;
import tech.rocketwave.airway.Airway;

@Configuration
@AllArgsConstructor
public class GetPokeItemByNameOrIdQueryHandlerConfiguration {

    private PokeItemRepository repository;
    private Airway airway;

    @Bean
    public GetPokeItemByNameOrIdQueryHandler getPokeItemByNameOrIdQueryHandler() {
        var handle = new GetPokeItemByNameOrIdQueryHandler(repository);
        airway.register(GetPokeItemByNameOrIdQuery.class, handle);
        return handle;
    }
}
