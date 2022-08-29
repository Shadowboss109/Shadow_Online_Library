package com.example.library;

public class Book {
    private String isbn;
    private String name;
    private String edition;
    private String author;
    private int year;
    private String category;
    private String summary;
    

    public Book() {
    }

    public Book(String isbn, String name, String edition, String author, int year, String category, String summary) {
        this.isbn = isbn;
        this.name = name;
        this.edition = edition;
        this.author = author;
        this.year = year;
        this.category = category;
        this.summary = summary;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdition() {
        return this.edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Book isbn(String isbn) {
        setIsbn(isbn);
        return this;
    }

    public Book name(String name) {
        setName(name);
        return this;
    }

    public Book edition(String edition) {
        setEdition(edition);
        return this;
    }

    public Book author(String author) {
        setAuthor(author);
        return this;
    }

    public Book year(int year) {
        setYear(year);
        return this;
    }

    public Book category(String category) {
        setCategory(category);
        return this;
    }

    public Book summary(String summary) {
        setSummary(summary);
        return this;
    }

    

    @Override
    public String toString() {
        return "{" +
            " isbn='" + getIsbn() + "'" +
            ", name='" + getName() + "'" +
            ", edition='" + getEdition() + "'" +
            ", author='" + getAuthor() + "'" +
            ", year='" + getYear() + "'" +
            ", category='" + getCategory() + "'" +
            ", summary='" + getSummary() + "'" +
            "}";
    }
    

}
