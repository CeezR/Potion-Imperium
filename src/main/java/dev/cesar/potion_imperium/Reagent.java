package dev.cesar.potion_imperium;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Reagent {
    @JsonProperty("name")
    private String name;
    @JsonProperty("quality")
    private Quality quality;
    @JsonProperty("properties")
    private List<String> properties;
    @JsonProperty("description")
    private String description;

    public Reagent() {}

    public Reagent(String name, Quality quality, List<String> properties, String description) {
        this.name = name;
        this.quality = quality;
        this.properties = properties;
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

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Reagent{" +
                "name='" + name + '\'' +
                ", quality=" + quality +
                ", properties=" + properties +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {

        private String name;
        private Quality quality;
        private List<String> properties;
        private String description;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withQuality(Quality quality) {
            this.quality = quality;
            return this;
        }

        public Builder withProperties(List<String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Reagent createReagent() {
            return new Reagent(name, quality, properties, description);
        }
    }
}
