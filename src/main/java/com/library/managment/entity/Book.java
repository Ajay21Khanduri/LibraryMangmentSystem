package com.library.managment.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Book extends LibraryItems implements  Cloneable {

    BookDetails bookDetails;
    @Override
    public String getDetails() {
        return "Book [id=" + getId() + ", title=" + getTitle() + ", author=" + bookDetails.getAuthor() + ", isbn=" + bookDetails.getIsbn() + "]";
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book cloned = (Book) super.clone();
        cloned.bookDetails = bookDetails.clone(); // Deep copy of BookDetails
        return cloned;
    }



}
