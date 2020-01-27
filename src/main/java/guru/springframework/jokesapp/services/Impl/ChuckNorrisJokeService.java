package guru.springframework.jokesapp.services.Impl;

import guru.springframework.jokesapp.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class ChuckNorrisJokeService implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
