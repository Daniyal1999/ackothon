package com.acko.ackothon.services;

import com.acko.ackothon.clients.GoogleClient;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;
import org.json.JSONTokener;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WordSearchService {

    private final GoogleClient googleClient;

    @SneakyThrows
    public String searchWordMeaning(String word) {
        JSONParser jsonParser = new JSONParser();
        String result = "";
        FileReader reader = new FileReader("src/main/resources/word-meanings.json");
        org.json.simple.JSONObject json = (org.json.simple.JSONObject)jsonParser.parse(reader);
        JSONArray jsonArray= (JSONArray)json.get("dictionary");
        for (int i=0;i<jsonArray.size();i++){
            org.json.simple.JSONObject entry= (org.json.simple.JSONObject)jsonArray.get(i);
            String key = (String)entry.get("key");
            if (key.equalsIgnoreCase(word)){
                result = (String)entry.get("definition");
                break;
            }
        }
        return result.isBlank()?"Sorry, Failed to get response...":result;
    }




}
