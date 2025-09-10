package com.xworkz.theatre;

import com.xworkz.theatre.Theatre.Theatre;

import java.util.Scanner;

public class TheatreRunner {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of movie details you want to enter");
            int size = sc.nextInt();

            Theatre theatre = new Theatre(size);

            System.out.println("The available movie slots are " + theatre.movies.length);

            for(int i = 0; i < size; i++){
                Movie movie = new Movie();

                System.out.println("Enter the movie ID");
                movie.setMovieId(sc.nextInt());

                System.out.println("Enter the movie name");
                movie.setMovieName(sc.next());

                System.out.println("Enter the movie genre");
                movie.setGenre(sc.next());

                System.out.println("Enter the movie language");
                movie.setLanguage(sc.next());

                System.out.println("Enter the movie duration (in minutes)");
                movie.setDuration(sc.nextInt());

                System.out.println("Enter the movie rating");
                movie.setRating(sc.nextInt());

                theatre.addMovie(movie);
            }

            theatre.getAllMovieDetails();

            theatre.updateMovieNameById(1, "Inception");
            theatre.updateGenreById(1, "Sci-Fi");
            theatre.updateLanguageById(1, "English");
            theatre.updateDurationById(1, 148);
            theatre.updateRatingById(1, 9);

            theatre.getAllMovieDetails();

            System.out.println("Enter the id to fetch the name:");
            String movieName = theatre.getMovieNameById(sc.nextInt());
            System.out.println(movieName);

            System.out.println("Enter the id to fetch the genre:");
            String genre = theatre.getGenreById(sc.nextInt());
            System.out.println(genre);

            System.out.println("Enter the id to fetch the language:");
            String language = theatre.getLanguageById(sc.nextInt());
            System.out.println(language);

            System.out.println("Enter the id to fetch the duration:");
            int duration = theatre.getDurationById(sc.nextInt());
            System.out.println(duration);

            System.out.println("Enter the id to fetch the rating:");
            int rating = theatre.getRatingById(sc.nextInt());
            System.out.println(rating);
        }
    }

