package org.example.src.repository;


import org.example.src.Item.PosterItem;

public class PosterRepository {

    private PosterItem[] items = new PosterItem[0];
    private int limit;

    public PosterRepository(int limit) {
        this.limit = limit;
    }

    public PosterRepository() {
        limit = 10;
    }

    public void addNewFilm(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public void removeFilmById(int id) {
        PosterItem[] tmp = new PosterItem[items.length - 1];
        int copyToIndex = 0;
        for (PosterItem item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public PosterItem[] getItems() {
        return items;
    }

    public PosterItem findById(int id) {
        for (PosterItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void removeAll() {
        items = new PosterItem[0];
    }

    public PosterItem[] findAll() {
        return items;
    }


    public PosterItem[] findLast() {                          // Обратный порядок
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        PosterItem[] all = new PosterItem[resultLength];
        for (int i = 0; i < all.length; i++) {
            all[i] = items[items.length - i - 1];
        }
        return all;

    }
}

