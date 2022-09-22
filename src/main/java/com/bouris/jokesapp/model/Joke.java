package com.bouris.jokesapp.model;

public class Joke {
    String joke;


    public Joke (String joke){
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
