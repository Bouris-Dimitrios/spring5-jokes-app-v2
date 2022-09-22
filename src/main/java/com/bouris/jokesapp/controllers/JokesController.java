package com.bouris.jokesapp.controllers;


import com.bouris.jokesapp.model.Joke;
import com.bouris.jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokesService jokesService;

    public JokesController(JokesService jokerService) {
        this.jokesService = jokerService;
    }

    @RequestMapping("/joke")
    public String getJoke(Model model){

        model.addAttribute("joke",jokesService.fetchJoke());

        return "jokes/quote";
    }
}
