package com.acko.ackothon.services;

import com.acko.ackothon.clients.GoogleClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashSet;
import java.util.Set;


@Service
@RequiredArgsConstructor
public class WordSearchService {

    private final GoogleClient googleClient;

    public ResponseEntity searchWordMeaning(String word){
        String searchString = "define" + word;
        System.out.println(searchString);

//        Set<String> links = new HashSet<>();
//        Document doc = googleClient.getResults(searchString);
//        Elements elements = doc.select("a[href]");
//        for (Element element : elements) {
//            links.add(element.attr("href"));
//        }
//
//        for (String url : links)
//        {
//            System.out.println(url);
//        }
        return ResponseEntity.ok("hello");
    }


}
