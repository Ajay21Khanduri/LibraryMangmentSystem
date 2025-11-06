package com.library.managment.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class BookDetails implements Cloneable {

    private String author;
    private String isbn;

    public BookDetails() {}

    public BookDetails(String author, String isbn) {
        this.author = author;
        this.isbn = isbn;
    }


    @Override
    public BookDetails clone() throws CloneNotSupportedException {
        return (BookDetails) super.clone(); // Shallow copy is fine if fields are primitives or immutable
    }

}