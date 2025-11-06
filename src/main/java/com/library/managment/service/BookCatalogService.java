package com.library.managment.service;

import com.library.managment.entity.Book;
import com.library.managment.exception.ItemNotFoundException;
import com.library.managment.repository.BookCatalogServiceRepository;
import com.library.managment.sorting.BookTitleSorting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class BookCatalogService {

    @Autowired  BookCatalogServiceRepository bookCatalogServiceRepository;

    public Book saveBook(Book book){
        return bookCatalogServiceRepository.save(book);
    }

    public List<Book> getAllBooks() {
        List<Book> books = bookCatalogServiceRepository.findAll();
        if (books.isEmpty()) {
            throw new ItemNotFoundException("No books found in Library.");
        }
        return books;
    }


    public List<Book> getAllBooksByTitleSorted(){
        List<Book> bookList = bookCatalogServiceRepository.findAll();
        Collections.sort(bookList,new BookTitleSorting());
        return  bookList;
    }

    public Book getBookById(Long id) {
        return bookCatalogServiceRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("Book not found for id: " + id));
    }

    public void deleteById(Long Id){
        bookCatalogServiceRepository.deleteById(Id);
    }
}
