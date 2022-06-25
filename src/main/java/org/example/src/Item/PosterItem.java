package org.example.src.Item;

public class PosterItem {
    private int id;
    private int posterId;
    private String posterName;


    public PosterItem(int id, int posterId, String posterName) {
        this.id = id;
        this.posterId = posterId;
        this.posterName = posterName;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }


}

