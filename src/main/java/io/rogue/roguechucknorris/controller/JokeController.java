package io.rogue.roguechucknorris.controller;

import io.rogue.roguechucknorris.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/", ""})
    public String getRandomChuckNorrisJoke(Model model) {
        model.addAttribute("joke", jokeService.getQuote());
        return "chuckNorris";
    }
}
