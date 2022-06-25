package org.example.src.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PosterManagerTest {

    @Test
    public void shouldAllFilm() {
        PosterManager manager = new PosterManager(10);
        manager.addNewFilm("film 1");
        manager.addNewFilm("film 2");
        manager.addNewFilm("film 3");
        manager.addNewFilm("film 4");
        manager.addNewFilm("film 5");
        manager.addNewFilm("film 6");
        manager.addNewFilm("film 7");
        manager.addNewFilm("film 8");
        manager.addNewFilm("film 9");
        manager.addNewFilm("film 10");


        String[] expected = {"film 1", "film 2", "film 3", "film 4", "film 5", "film 6", "film 7", "film 8", "film 9", "film 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFilmsFromTheEnd() {
        PosterManager manager = new PosterManager();

        manager.addNewFilm("film 1");
        manager.addNewFilm("film 2");
        manager.addNewFilm("film 3");
        manager.addNewFilm("film 4");
        manager.addNewFilm("film 5");
        manager.addNewFilm("film 6");
        manager.addNewFilm("film 7");
        manager.addNewFilm("film 8");
        manager.addNewFilm("film 9");
        manager.addNewFilm("film 10");


        String[] expected = {"film 10", "film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFilmsFromTheEndLimit() {
        PosterManager manager = new PosterManager(15);

        manager.addNewFilm("film 2");
        manager.addNewFilm("film 3");
        manager.addNewFilm("film 4");
        manager.addNewFilm("film 5");
        manager.addNewFilm("film 6");
        manager.addNewFilm("film 7");
        manager.addNewFilm("film 8");
        manager.addNewFilm("film 9");
        manager.addNewFilm("film 10");

        String[] expected = {"film 10", "film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
