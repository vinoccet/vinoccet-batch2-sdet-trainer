import edu.in.movies.MovieInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieInfo movieInfo=new MovieInfo();

        System.out.println("Enter the number of movie details to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter movie details (title:runtimeInMinutes)");
        for (int i = 0; i < n; i++) {
            String details = sc.nextLine();
// add details
            movieInfo.addMovieDetails(details);
        }

        System.out.println("Enter the minimum runtime in minutes");
        int minRuntime = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the maximum runtime in minutes");
        int maxRuntime = Integer.parseInt(sc.nextLine());

        List<String> moviesList = movieInfo.getMoviesWithinGivenRuntimeRange(minRuntime,maxRuntime);// get the result


        if (moviesList.isEmpty()) {
            System.out.println("No Movies found within the specified runtime range");
        } else {
            System.out.println("Movies with runtime between " + minRuntime + " and " + maxRuntime + " minutes:");
            for (String movieName : moviesList) {
                System.out.println(movieName);
            }
        }

        sc.close();
    }
}
