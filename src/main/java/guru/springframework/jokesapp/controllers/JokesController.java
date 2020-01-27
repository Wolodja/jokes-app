package guru.springframework.jokesapp.controllers;


import guru.springframework.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @Qualifier("chuckNorrisJokeService")
    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){

        model.addAttribute("joke", jokeService.getRandomQuote());

        return "chucknorris";

    }

}
