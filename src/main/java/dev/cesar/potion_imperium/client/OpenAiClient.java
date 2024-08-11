package dev.cesar.potion_imperium.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.cesar.potion_imperium.dto.openai.RequestDTO;
import dev.cesar.potion_imperium.dto.openai.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class OpenAiClient {

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

    @Value("${openai.api.key}")
    private String apiKey;

    private final RestClient restClient;

    @Autowired
    public OpenAiClient(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.build();
    }

    public ResponseDTO promt(RequestDTO requestDTO) {
        return restClient
                .post()
                .uri(apiUrl)
                .body(requestDTO)
                .header("Authorization", "Bearer " + apiKey)
                .retrieve()
                .body(ResponseDTO.class);
    }


}
