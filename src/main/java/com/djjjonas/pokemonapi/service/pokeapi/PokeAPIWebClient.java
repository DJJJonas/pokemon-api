package com.djjjonas.pokemonapi.service.pokeapi;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PokeAPIWebClient {
    @Bean
    public WebClient webClientPokemon(WebClient.Builder builder) {
        return builder
                .baseUrl("https://pokeapi.co/api/v2")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
