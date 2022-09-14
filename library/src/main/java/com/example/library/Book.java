package com.example.library;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

@Entity
@Table(name="library")
public class Book {
    @Id
    @SequenceGenerator(
        name="book_sequence",
        sequenceName = "book_sequence",
        allocationSize = 1
    )
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;

    public Long getId() {
        return this.Id;
    }


    public void setId(Long Id) {
        this.Id = Id;
    }

    @NotNull
    @Column(name = "ISBN", unique = true)
    private Long isbn;
    
    @NotNull
    @Column(name = "Book_name")
    private String name;

    @NotNull
    @Column(name = "Edition")
    private String edition;

    @NotNull
    @Column(name = "Author")
    private String author;

    @NotNull
    @Column(name = "Year")
    private int year;

    @NotNull
    @Column(name = "Category")
    private String category;

    @NotNull
    @Column(name = "Summary")
    private String summary;
    

    public Book() {
    }

    public Book(Long isbn, String name, String edition, String author, int year, String category, String summary) {
        this.isbn = isbn;
        this.name = name;
        this.edition = edition;
        this.author = author;
        this.year = year;
        this.category = category;
        this.summary = summary;
    }

    public Long getIsbn() {
        return this.isbn;
    }

    public void setIsbn(Long isbn) {
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

    public Book isbn(Long isbn) {
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
