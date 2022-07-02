package org.example.src.domain;
import org.example.src.Item.PosterItem;
import org.example.src.repository.PosterRepository;

public class PosterManager {

    private PosterRepository repo;                                       // переменная для связи с репозиторием

    public PosterManager(PosterRepository repo) {                       // принимает ячейку репозитория через конструктор
        this.repo = repo;
    }

    public PosterManager(){

    }

    public void addFilms(PosterItem item) {                             // добавление элементов
        repo.addNewFilm(item);
    }

    public PosterItem[] findAll() {                                     // вывод всех фильмов в порядке добавления
        PosterItem[] all = repo.getItems();
        return all;
    }

    public PosterItem[] findLast(){
        PosterItem[] allLast = repo.findLast();
        return allLast;
    }
}

