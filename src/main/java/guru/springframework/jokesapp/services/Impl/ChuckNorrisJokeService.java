package guru.springframework.jokesapp.services.Impl;

import guru.springframework.jokesapp.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckNorrisJokeService implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
