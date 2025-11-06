package com.library.managment.entity;

import jakarta.persistence.Entity;

@Entity
public class Magazine extends LibraryItems {
    private String author;
    private String isbn;

    @Override
    public String getDetails() {
        return "Magazine [id=" + getId() + ", title=" + getTitle() + ", author=" + author + ", isbn=" + isbn + "]";
    }
}
