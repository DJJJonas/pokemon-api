package com.djjjonas.pokemonapi.domains.pokemon.core;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    public static enum PokeTypeNameEnum {
        normal, fire, water,
        grass, electric, ice,
        fighting, poison, ground,
        flying, psychic, bug,
        rock, ghost, dark,
        dragon, steel, fairy,
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PokeType {
        private PokeTypeNameEnum name;
        private String url;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PokeTypeObject {
        private Integer slot;
        private PokeType type;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PokeSprites {
        @JsonProperty("back_default")
        private String backDefault;
        @JsonProperty("back_female")
        private String backFemale;
        @JsonProperty("back_shiny")
        private String backShiny;
        @JsonProperty("back_shiny_female")
        private String backShinyFemale;
        @JsonProperty("front_default")
        private String frontDefault;
        @JsonProperty("front_female")
        private String frontFemale;
        @JsonProperty("front_shiny")
        private String frontShiny;
        @JsonProperty("front_shiny_female")
        private String frontShinyFemale;
    }

    private Integer id;
    private String name;
    private Integer height;
    private Integer weight;
    private PokeSprites sprites;
    private List<PokeTypeObject> types;
}
