package com.djjjonas.pokemonapi.domains.item.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djjjonas.pokemonapi.domains.item.application.query.GetPokeItemByNameOrIdQuery;
import com.djjjonas.pokemonapi.domains.item.core.PokeItem;

import lombok.AllArgsConstructor;
import tech.rocketwave.airway.Airway;

@AllArgsConstructor
@RestController("get-item-by-name-or-id")
@RequestMapping("/api/item")
public class GetItemByNameOrIdRestController {
    private Airway airway;

    @GetMapping("/{nameOrId}")
    public ResponseEntity<PokeItem> getPokemonByNameOrId(@PathVariable("nameOrId") String nameOrId) {
        PokeItem item = airway.dispatch(new GetPokeItemByNameOrIdQuery(nameOrId));

        return ResponseEntity.ok().body(item);
    }
}
