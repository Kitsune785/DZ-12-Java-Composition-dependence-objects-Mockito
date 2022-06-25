package org.example.src.repository;

import org.example.src.Item.PosterItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterRepositoryTest {

    PosterRepository repo = new PosterRepository();

    PosterItem item1 = new PosterItem(1, 11, "film1");
    PosterItem item2 = new PosterItem(2, 12, "film1");
    PosterItem item3 = new PosterItem(3, 13, "film1");
    PosterItem item4 = new PosterItem(4, 14, "film1");
    PosterItem item5 = new PosterItem(5, 15, "film1");
    PosterItem item6 = new PosterItem(6, 16, "film1");
    PosterItem item7 = new PosterItem(7, 17, "film1");

    @BeforeEach
    public void setup() {
        repo.addNewFilm(item1);
        repo.addNewFilm(item2);
        repo.addNewFilm(item3);
    }

    @Test
    public void addFilms() {

        PosterItem[] expected = {item1, item2, item3};
        PosterItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void removeFilmsById() {

        repo.removeFilmById(item2.getId());

        PosterItem[] expected = {item1, item3};
        PosterItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void findByIdFoundTest() {

        PosterItem expected = item1;
        PosterItem actual = repo.findById(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void noFindByIdFound() {

        PosterItem expected = null;
        PosterItem actual = repo.findById(4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void removeAllFilms() {

        repo.removeAll();

        PosterItem[] expected = new PosterItem[0];
        PosterItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
