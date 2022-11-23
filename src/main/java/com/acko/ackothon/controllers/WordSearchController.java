package com.acko.ackothon.controllers;

import com.acko.ackothon.services.AckoInternalData;
import com.acko.ackothon.services.WordSearchService;
import com.acko.ackothon.constants.Url;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class WordSearchController {

    private final WordSearchService wordSearchService;
    private final AckoInternalData ackoInternalData;

    @GetMapping(path= Url.GET_WORD_MEANING)
    public ResponseEntity searchWordMeaning(@PathVariable(value="word") String word){
        return ResponseEntity.ok(wordSearchService.searchWordMeaning(word));
    }

    @GetMapping(path = Url.GET_INTERNAL_INFO)
    public ResponseEntity<String> getInternalAnswer(@PathVariable(value = "word") String word) {
      return ResponseEntity.ok(ackoInternalData.getAnswerForGivenAckoQuestion(word));
    }


}
