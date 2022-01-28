package ru.netology.domain;

public class Movie {
    private int id;
    private int movieId;
    private String movieName;
    private String movieGenre;
    private boolean premiere;

    public Movie() {
    }

    public Movie(int id, int movieId, String movieName, String movieGenre, boolean premiere) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.premiere = premiere;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public void setPremiere(boolean premiere) {
        this.premiere = premiere;
    }

    public int getId() {
        return id;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public boolean isPremiere() {
        return premiere;
    }

}

