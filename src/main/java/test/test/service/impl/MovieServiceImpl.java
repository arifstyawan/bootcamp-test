package test.test.service.impl;

import org.springframework.stereotype.Service;
import test.test.dto.MovieRequest;
import test.test.entity.Movie;
import test.test.repository.MovieRepository;
import test.test.service.MovieService;

import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    private MovieRepository movieRepository;
    private MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public String save(MovieRequest request) {
        saveToDB(request);
        return "Succes";

    }
    @Override
    public String get (Long id){
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isPresent()) {
            return "Success";
        } else {
            return "Data Not Found";
        }
    }
//    @Override
//    public String get (String title){
//        Optional<Movie> movie = movieRepository.findAll(title);
//        if (movie.isPresent()) {
//            return "Success";
//        } else {
//            return "Data Not Found";
//        }
//    }
    private void saveToDB (MovieRequest request){
            Movie movie = new Movie();

            movie.setTitle(request.getTitle());
            movie.setGenre(request.getGenre());
            movie.setDuration(request.getDuration());
            movie.setDirector(request.getDirector());
            movie.setRating(request.getRating());

            movieRepository.save(movie);
        }

    }
