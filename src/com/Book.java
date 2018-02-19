package com;

public class Book {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public String bookTitle() {

        return this.getTitle();

    }
}
