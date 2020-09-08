package com.shambonik;

public class Book {
    private int numberOfPages;
    private String name;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(int numberOfPages, String name) {
        this.numberOfPages = numberOfPages;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                ", name='" + name + '\'' +
                '}';
    }
}
