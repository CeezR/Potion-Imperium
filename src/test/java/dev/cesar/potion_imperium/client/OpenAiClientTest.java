package dev.cesar.potion_imperium.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.web.util.UriComponentsBuilder;


import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RestClientTest(OpenAiClient.class)
class OpenAiClientTest {

    @Autowired
    MockRestServiceServer server;

    @Autowired
    OpenAiClient client;

    @Test
    void promt() {
        server.expect(requestTo(UriComponentsBuilder.fromHttpUrl("https://api.openai.com/v1/chat/completions").toUriString()))
                .andExpect(method(HttpMethod.POST))
                .andRespond(withSuccess("Hello OpenAI", MediaType.APPLICATION_JSON));

        client.promt();

        server.verify();

    }
}