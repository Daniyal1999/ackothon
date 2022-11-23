package com.acko.ackothon;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Service
@Log4j2
@RequiredArgsConstructor
public class WordSearchService {

    private final GoogleClient googleClient;

    @GetMapping("/ackothon/{word}")
    public ResponseEntity searchWordMeaning(@PathVariable String word){
        String searchString = "define" + word;
        return ResponseEntity.ok(googleClient.getResults(searchString));
    }

}
