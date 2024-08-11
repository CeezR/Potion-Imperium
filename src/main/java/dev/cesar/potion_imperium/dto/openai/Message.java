package dev.cesar.potion_imperium.dto.openai;

public record Message(
        String role,
        String content
) {
    public Message(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public static class Builder {

        private String role;
        private String content;

        public Builder withRole(String role) {
            this.role = role;
            return this;
        }

        public Builder withContent(String content) {
            this.content = content;
            return this;
        }

        public Message createMessage() {
            return new Message(role, content);
        }
    }
}
