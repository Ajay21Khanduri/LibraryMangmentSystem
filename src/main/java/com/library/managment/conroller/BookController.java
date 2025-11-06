package com.library.managment.conroller;

import com.library.managment.entity.Book;
import com.library.managment.service.BookCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/bookstore")
public class BookController {

    @Autowired
    BookCatalogService bookCatalogService;

    @PostMapping("/book/create")
    private Book createBook(@RequestBody  Book book){
        return bookCatalogService.saveBook(book);
    }

    @GetMapping("/books")
    private List<Book> getAllBooks(){
        return bookCatalogService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    private Book getBookById(@PathVariable Long id){
        return bookCatalogService.getBookById(id);
    }

    @GetMapping("/books/sorted")
    private List<Book> getAllBooksByTitleSorted(){
        return bookCatalogService.getAllBooksByTitleSorted();
    }

    @DeleteMapping("/book/{id}")
    private void deleteBookById(@PathVariable Long id){
         bookCatalogService.deleteById(id);
    }


}
