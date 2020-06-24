package io.rogue.roguechucknorris.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    private final ChuckNorrisQuotes quotes;

    @Autowired
    public JokeService(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    public String getQuote() {
        return quotes.getRandomQuote();
    }
}
