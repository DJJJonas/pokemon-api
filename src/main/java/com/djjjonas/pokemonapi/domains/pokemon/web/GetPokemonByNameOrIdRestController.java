package com.djjjonas.pokemonapi.domains.pokemon.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djjjonas.pokemonapi.domains.pokemon.application.query.GetPokemonByNameOrIdQuery;
import com.djjjonas.pokemonapi.domains.pokemon.core.Pokemon;

import lombok.AllArgsConstructor;
import tech.rocketwave.airway.Airway;

@AllArgsConstructor
@RequestMapping("/api/pokemon")
@RestController("get-pokemon-by-name-or-id")
public class GetPokemonByNameOrIdRestController {

    private Airway airway;

    @GetMapping("/{nameOrId}")
    public ResponseEntity<Pokemon> getPokemonByNameOrId(@PathVariable("nameOrId") String nameOrId) {
        Pokemon pokemon = airway.dispatch(new GetPokemonByNameOrIdQuery(nameOrId));

        return ResponseEntity.ok().body(pokemon);
    }
}
