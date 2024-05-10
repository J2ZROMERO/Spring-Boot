package github.com.J2ZROMERO.movies.service;

import github.com.J2ZROMERO.movies.model.Movie;
import github.com.J2ZROMERO.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){

        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
