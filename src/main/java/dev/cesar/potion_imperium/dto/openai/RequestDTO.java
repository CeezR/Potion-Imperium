package dev.cesar.potion_imperium.dto.openai;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record RequestDTO(
        String model,
        List<Message> messages,
        @JsonProperty("response_format")
        ResponseFormat responseFormat
) {

    public static class Builder {

        private String model;
        private List<Message> messages;

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder withMessages(List<Message> messages) {
            this.messages = messages;
            return this;
        }

        public RequestDTO createRequestDTO() {
            return new RequestDTO(model, messages, new ResponseFormat("json_object"));
        }
    }
}
