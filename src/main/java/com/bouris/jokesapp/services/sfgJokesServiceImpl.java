package com.bouris.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class sfgJokesServiceImpl implements JokesService{
    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String fetchJoke() {
        return quotes.getRandomQuote();
    }
}
