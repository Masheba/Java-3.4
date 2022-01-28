package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieBoardManagerTest {


    @Test
    public void shouldAddMovie() {
        MovieBoardManager movieBoardManager = new MovieBoardManager();
        Movie first = new Movie();
        Movie second = new Movie();
        Movie third = new Movie();
        Movie fourth = new Movie();
        Movie fifth = new Movie();

        movieBoardManager.add(first);
        movieBoardManager.add(second);
        movieBoardManager.add(third);
        movieBoardManager.add(fourth);
        movieBoardManager.add(fifth);

        Movie[] actual = movieBoardManager.getLatest();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {

        MovieBoardManager movieBoardManager = new MovieBoardManager();
        Movie first = new Movie(1, 20, "Джентльмены", "Боевик", false);
        Movie second = new Movie(2, 35, "Номер один", "Комедия", true);
        Movie third = new Movie(3, 14, "Отель Белград", "Комедия", false);
        Movie fourth = new Movie(4, 32, "Бладшот", "Боевик", false);
        Movie fifth = new Movie(5, 89, "Вперед", "Мультфильм", false);
        Movie sixth = new Movie(6, 23, "Человек-невидимка", "Ужасы", false);
        Movie seventh = new Movie(7, 1, "Тролли", "Мультфильм", true);
        Movie eighth = new Movie(8, 54, "Трудная мишень", "Боевик", false);
        Movie ninth = new Movie(9, 25, "Круэлла", "Драма", true);
        Movie tenth = new Movie(10, 11, "Вверх", "Мультфильм", true);

        movieBoardManager.add(first);
        movieBoardManager.add(second);
        movieBoardManager.add(third);
        movieBoardManager.add(fourth);
        movieBoardManager.add(fifth);
        movieBoardManager.add(sixth);
        movieBoardManager.add(seventh);
        movieBoardManager.add(eighth);
        movieBoardManager.add(ninth);
        movieBoardManager.add(tenth);

        Movie[] actual = movieBoardManager.getLatest();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllLimitedManager() {

        MovieBoardManager movieBoardManager = new MovieBoardManager(2);
        Movie first = new Movie(1, 20, "Джентльмены", "Боевик", false);
        Movie second = new Movie(2, 35, "Номер один", "Комедия", true);
        Movie third = new Movie(3, 14, "Отель Белград", "Комедия", false);
        Movie fourth = new Movie(4, 32, "Бладшот", "Боевик", false);
        Movie fifth = new Movie(5, 89, "Вперед", "Мультфильм", false);

        movieBoardManager.add(first);
        movieBoardManager.add(second);
        movieBoardManager.add(third);
        movieBoardManager.add(fourth);
        movieBoardManager.add(fifth);

        Movie[] actual = movieBoardManager.getLatest();
        Movie[] expected = new Movie[]{fifth, fourth};

        assertArrayEquals(expected, actual);
    }

}

