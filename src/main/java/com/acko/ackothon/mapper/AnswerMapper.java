package com.acko.ackothon.mapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.SneakyThrows;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@Component
public class AnswerMapper implements ApplicationListener<ApplicationReadyEvent> {

    @Getter
    private static Map<String, String> questionToAnswerMapper;

    @SneakyThrows
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        final String fileLocationInClasspath = "./answers.json";
        InputStream resourceInputStream = new ClassPathResource(fileLocationInClasspath).getInputStream();
        questionToAnswerMapper = new ObjectMapper().
                readValue(new String(resourceInputStream.readAllBytes(), StandardCharsets.UTF_8),
                        new TypeReference<HashMap<String, String>>() {});
    }
}



