package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

   /* public JokeServiceImpl() {
       chuckNorrisQuotes=new ChuckNorrisQuotes();
    }*/

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}