package io.rogue.roguechucknorris.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JokeServiceTest {
    private JokeService jokeService;

    @BeforeEach
    void setUp() {
        jokeService = new JokeService(new ChuckNorrisQuotes());
    }

    @Test
    void getQuote() {
        assertTrue(StringUtils.isNotBlank(jokeService.getQuote()));
    }
}