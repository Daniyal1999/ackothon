package com.acko.ackothon.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.jsoup.nodes.Document;

import java.net.URLEncoder;

@FeignClient(value="google-search-api", url= "https://www.google.com")
public interface GoogleClient {

    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    Document getResults(@RequestParam(value="q") final String word);
}
