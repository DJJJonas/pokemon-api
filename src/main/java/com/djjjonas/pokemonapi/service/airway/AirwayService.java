package com.djjjonas.pokemonapi.service.airway;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import tech.rocketwave.airway.Airway;
import tech.rocketwave.airway.InProcessAirway;

@Service
public class AirwayService {

    @Bean
    public Airway queryDispatcher() {
        return new InProcessAirway();
    }
}
