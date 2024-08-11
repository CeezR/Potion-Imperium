package dev.cesar.potion_imperium.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.cesar.potion_imperium.Potion;
import dev.cesar.potion_imperium.Quality;
import dev.cesar.potion_imperium.Reagent;
import dev.cesar.potion_imperium.dto.openai.Message;
import dev.cesar.potion_imperium.dto.openai.RequestDTO;
import dev.cesar.potion_imperium.dto.openai.ResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.web.util.UriComponentsBuilder;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@SpringBootTest
class OpenAiClientTest {

    @Autowired
    OpenAiClient client;

    @Autowired
    ObjectMapper mapper;

    @Test
    void promt() throws JsonProcessingException {
        Reagent reagent1 = new Reagent.Builder()
                .withName("Wolfsbane")
                .withProperties(List.of("Transformation", "Protection", "Poison"))
                .withQuality(Quality.Common)
                .withDescription("A potent herb often associated with lycanthropy. It is used to prevent transformation and offer protection against werewolves. It can also be used as a poison, so handle with caution.")
                .createReagent();

        Reagent reagent2 = new Reagent.Builder()
                .withName("Elf Dust")
                .withProperties(List.of("Invisibility", "Light Magic", "Agility"))
                .withQuality(Quality.Uncommon)
                .withDescription("A sparkling dust collected from the presence of elves. It grants invisibility, enhances light magic, and increases agility. Often used in stealth and precision magic.")
                .createReagent();

        RequestDTO requestDTO = new RequestDTO.Builder()
                .withModel("gpt-3.5-turbo")
                .withMessages(
                        List.of(new Message.Builder()
                                        .withRole("system")
                                        .withContent("You are a Alchemist Simulator, based only on a list of reagents brew something based on it. Please return your answer as JSON format with the name, rarity, effect, sideeffects.")
                                .createMessage(),
                                new Message.Builder()
                                        .withRole("user")
                                        .withContent(reagent1.toString() + " " + reagent2.toString())
                                        .createMessage()))
                .createRequestDTO();
        ResponseDTO responseDTO = client.promt(requestDTO);
        String json = mapper.writeValueAsString(responseDTO);
        Potion potion = mapper.readValue(responseDTO.choices().getFirst().message().content(), Potion.class);
        System.out.println(potion.toString());
    }

//
//    @Test
//    void promt() {
//        server.expect(requestTo(UriComponentsBuilder.fromHttpUrl("https://api.openai.com/v1/chat/completions").toUriString()))
//                .andExpect(method(HttpMethod.POST))
//                .andRespond(withSuccess("Hello OpenAI", MediaType.APPLICATION_JSON));
//
//        client.promt();
//
//        server.verify();
//
//    }
}