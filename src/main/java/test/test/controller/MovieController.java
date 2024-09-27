package test.test.controller;

import org.springframework.web.bind.annotation.*;
import test.test.dto.MovieRequest;
import test.test.service.MovieService;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }
    @PostMapping(value = "/add")
    public String add(@RequestBody MovieRequest request){
        return movieService.save(request);
    }

    @GetMapping(value = "/get/{id}")
    public String getDataMovieById(@PathVariable Long id){
        return movieService.get(id);
    }

//    @GetMapping(value = "/get/{title}")
//    public String getDataMovieByTitle(@PathVariable String title){
//        return movieService.get(title);
//    }

}
