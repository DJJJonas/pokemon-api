package com.djjjonas.pokemonapi.service.jackson;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ObjectMapperService {

    @Bean
    public ObjectMapper mapper() {
        return new ObjectMapper();
    }
}
