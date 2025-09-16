package edu.in.movies;

import java.util.ArrayList;
import java.util.List;

public class MovieInfo {

    // Arrays are fixed in nature
    // Lists are dynamic in nature

    // Arrays are object
    // List is an interface in java collection framework


    List<String> movieList = new ArrayList<>();

    public void addMovieDetails(String movieDetails) {
        movieList.add(movieDetails);
    }

    // Whiplash:90
    public List<String> getMoviesWithinGivenRuntimeRange(int minimumRuntime, int maximumRuntime) {
        List<String> movies = new ArrayList<>();
        // calculation
        for (String movie : movieList) {
            String[] movieSplit = movie.split(":");
            String movieName = movieSplit[0];
            int durationInMin = Integer.parseInt(movieSplit[1]);

            if (durationInMin >= minimumRuntime && durationInMin <= maximumRuntime) {
                movies.add(movieName);
            }
        }
        return movies;
    }
}
