package com.xworkz.theatre.Theatre;

import com.xworkz.theatre.Movie;

public class Theatre {

        public Theatre(int size) {
            movies = new Movie[size];
        }

        public Movie[] movies;
        int index;

        public boolean addMovie(Movie movie) {
            boolean isMovieAdded = false;
            if (movie != null) {
                movies[index++] = movie;
                isMovieAdded = true;
            } else {
                System.out.println("Invalid movie data");
            }
            return isMovieAdded;
        }

        public void getAllMovieDetails() {
            System.out.println("All the movie details are:");
            for (Movie movie : movies) {
                if (movie != null) {
                    System.out.println("The movie id is " + movie.getMovieId());
                    System.out.println("The movie name is " + movie.getMovieName());
                    System.out.println("The movie genre is " + movie.getGenre());
                    System.out.println("The movie language is " + movie.getLanguage());
                    System.out.println("The movie duration is " + movie.getDuration() + " minutes");
                    System.out.println("The movie rating is " + movie.getRating());
                    System.out.println("----------------------------------------");
                }
            }
        }

        public String updateMovieNameById(int id, String name) {
            if (id != 0) {
                for (Movie movie : movies) {
                    if (id == movie.getMovieId()) {
                        movie.setMovieName(name);
                    }
                }
            }
            return name;
        }

        public String updateGenreById(int id, String genre) {
            if (id != 0) {
                for (Movie movie : movies) {
                    if (id == movie.getMovieId()) {
                        movie.setGenre(genre);
                    }
                }
            }
            return genre;
        }

        public String updateLanguageById(int id, String lang) {
            if (id != 0) {
                for (Movie movie : movies) {
                    if (id == movie.getMovieId()) {
                        movie.setLanguage(lang);
                    }
                }
            }
            return lang;
        }

        public int updateDurationById(int id, int duration) {
            if (id != 0) {
                for (Movie movie : movies) {
                    if (id == movie.getMovieId()) {
                        movie.setDuration(duration);
                    }
                }
            }
            return duration;
        }

        public int updateRatingById(int id, int rating) {
            if (id != 0) {
                for (Movie movie : movies) {
                    if (id == movie.getMovieId()) {
                        movie.setRating(rating);
                    }
                }
            }
            return rating;
        }

        public String getMovieNameById(int id) {
            String movieName = null;
            for (Movie movie : movies) {
                if (id == movie.getMovieId()) {
                    movieName = movie.getMovieName();
                }
            }
            if (id == 0) {
                System.out.println("Movie name not found");
            }
            return movieName;
        }

        public String getGenreById(int id) {
            String genre = null;
            for (Movie movie : movies) {
                if (id == movie.getMovieId()) {
                    genre = movie.getGenre();
                }
            }
            if (id == 0) {
                System.out.println("Genre not found");
            }
            return genre;
        }

        public String getLanguageById(int id) {
            String lang = null;
            for (Movie movie : movies) {
                if (id == movie.getMovieId()) {
                    lang = movie.getLanguage();
                }
            }
            if (id == 0) {
                System.out.println("Language not found");
            }
            return lang;
        }

    public int getDurationById(int id) {
        int duration = 0;
        for (Movie movie : movies) {
            if (id == movie.getMovieId()) {
                duration = movie.getDuration();
            }
        }
        if (id == 0) {
            System.out.println("Duration not found");
        }
        return duration;
    }

    public int getRatingById(int id) {
        int rating = 0;
        for (Movie movie : movies) {
            if (id == movie.getMovieId()) {
                rating = movie.getRating();
            }
        }
        if (id == 0) {
            System.out.println("Rating not found");
        }
        return rating;
    }

    public boolean isMovieExistById(int id) {
        boolean found = false;
        for (Movie movie : movies) {
            if (id == movie.getMovieId()) {
                found = true;
            }
        }
        return found;
    }

    public int getTotalMovies() {
        return index;
    }
}
