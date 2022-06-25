package org.example.src.domain;

public class PosterManager {

    private String[] films = new String[0];
    private int limit;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
        limit = 10;

    }

    public void addNewFilm(String film) {                    // добавление фильма
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {                             // вывод всех фильмов
        return films;
    }

    public String[] findLast() {                            // Обратный порядок
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] all = new String[resultLength];
        for (int i = 0; i < all.length; i++) {
            all[i] = films[films.length - i - 1];
        }
        return all;
    }
}
