package com.djjjonas.pokemonapi.domains.item.core;

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
public class PokeItem {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PokeItemLanguage {
        private String name;
        private String url;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PokeItemName {
        private String name;
        private PokeItemLanguage language;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PokeItemSprite {
        @JsonProperty("default")
        private String defaultUrl;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PokeItemEffectEntry {
        private String effect;
        private String shortEffect;
        private PokeItemLanguage language;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PokeItemFlavorTextEntry {
        private String text;
        private PokeItemLanguage versionGroup;
        private PokeItemLanguage language;
    }

    private Integer id;
    private String name;
    private Integer cost;
    private List<PokeItemEffectEntry> effectEntries;
    private List<PokeItemFlavorTextEntry> flavorTextEntries;
    private List<PokeItemName> names;
    private List<PokeItemSprite> sprites;
}
