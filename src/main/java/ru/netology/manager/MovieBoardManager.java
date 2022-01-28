package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieBoardManager {
    int managerLimit = 10;

    public MovieBoardManager() {
    }

    public MovieBoardManager(int managerLimit) {
        this.managerLimit = managerLimit;
    }

    private Movie[] movies = new Movie[0];

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getLatest() {
        int length = managerLimit;
        if (movies.length < length) {
            length = movies.length;
        }

        Movie[] result = new Movie[length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}

