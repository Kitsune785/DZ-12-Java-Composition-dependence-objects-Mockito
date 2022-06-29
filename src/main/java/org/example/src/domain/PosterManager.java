package org.example.src.domain;
import org.example.src.Item.PosterItem;
import org.example.src.repository.PosterRepository;

public class PosterManager {

    private PosterRepository repo;                                       // переменная для связи с репозиторием
    private int limit;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
        limit = 10;
    }

    public PosterManager(PosterRepository repo) {                       // принимает ячейку репозитория через конструктор
        this.repo = repo;
    }

    public void addFilms(PosterItem item) {                             // добавление элементов
        repo.addNewFilm(item);
    }

    public PosterItem[] findAll() {                                     // вывод всех фильмов в порядке добавления
        PosterItem[] all = repo.getItems();
        return all;
    }

//    public String[] findLast() {                            // Обратный порядок
//        int resultLength;
//        if (films.length < limit) {
//            resultLength = films.length;
//        } else {
//            resultLength = limit;
//        }
//        String[] all = new String[resultLength];
//        for (int i = 0; i < all.length; i++) {
//            all[i] = films[films.length - i - 1];
//        }
//        return all;
//    }

}

