package dev.cesar.potion_imperium.dto.openai;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Usage(
        @JsonProperty("prompt_tokens")
        long promptTokens,
        @JsonProperty("completion_tokens")
        long completionTokens,
        @JsonProperty("total_tokens")
        long totalTokens

) {
    public Usage(@JsonProperty("prompt_tokens")
                 long promptTokens, @JsonProperty("completion_tokens")
                 long completionTokens, @JsonProperty("total_tokens")
                 long totalTokens) {
        this.promptTokens = promptTokens;
        this.completionTokens = completionTokens;
        this.totalTokens = totalTokens;
    }

    public static class Builder {

        private long promptTokens;
        private long completionTokens;
        private long totalTokens;

        public Builder withPromptTokens(long promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }

        public Builder withCompletionTokens(long completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }

        public Builder withTotalTokens(long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        public Usage createUsage() {
            return new Usage(promptTokens, completionTokens, totalTokens);
        }
    }
}
