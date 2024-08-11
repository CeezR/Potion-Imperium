package dev.cesar.potion_imperium;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Potion {
    @JsonProperty("name")
    private String name;
    @JsonProperty("quality")
    private Quality quality;
    @JsonProperty("description")
    private String description;

    public Potion() {
    }

    public Potion(String name, Quality quality, String description) {
        this.name = name;
        this.quality = quality;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
