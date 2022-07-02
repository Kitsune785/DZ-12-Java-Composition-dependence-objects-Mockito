package org.example.src.domain;

import org.example.src.Item.PosterItem;
import org.example.src.repository.PosterRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class PosterManagerTest {

//    PosterRepository repo = Mockito.mock(PosterRepository.class);
    //    PosterRepository repo = new PosterRepository();
//    PosterManager manager = new PosterManager(repo);

    PosterItem item1 = new PosterItem(1, 11, "film1");
    PosterItem item2 = new PosterItem(2, 12, "film1");
    PosterItem item3 = new PosterItem(3, 13, "film1");
    PosterItem item4 = new PosterItem(4, 14, "film1");
    PosterItem item5 = new PosterItem(5, 15, "film1");
    PosterItem item6 = new PosterItem(6, 16, "film1");
    PosterItem item7 = new PosterItem(7, 17, "film1");

    @Test
    public void shouldAllFilms() {
        PosterRepository repo = Mockito.mock(PosterRepository.class);
        PosterManager manager = new PosterManager(repo);
        PosterItem[] items = {item1, item2, item3, item4, item5, item6, item7};
        doReturn(items).when(repo).getItems();


        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFilmsFromTheEndLimit() {
        PosterRepository repo = new PosterRepository();
        PosterManager manager = new PosterManager(repo);

        manager.addFilms(item1);
        manager.addFilms(item2);
        manager.addFilms(item3);
        manager.addFilms(item4);
        manager.addFilms(item5);
        manager.addFilms(item6);
        manager.addFilms(item7);

        PosterItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

