package dev.cesar.potion_imperium.dto.openai;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ResponseDTO(
        String id,
        String object,
        long created,
        String model,
        List<Choice> choices,
        Usage usage,
        @JsonProperty("system_fingerprint")
        String systemFingerprint
) {
}
