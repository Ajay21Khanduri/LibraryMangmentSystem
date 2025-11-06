package com.library.managment.conroller;

import com.library.managment.entity.Book;
import com.library.managment.entity.Magazine;
import com.library.managment.service.BookCatalogService;
import com.library.managment.service.MagazineCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/magazinestore")
public class MagazineController {

    @Autowired
    MagazineCatalogService magazineCatalogService;

    @PostMapping("/create")
    private Magazine createMagazine(@RequestBody Magazine magazine){
        return magazineCatalogService.saveMagazine(magazine);
    }

    @GetMapping("/magazines")
    private List<Magazine> getAllMagazines(){
       return magazineCatalogService.getAllMagazines();
    }

    @GetMapping("/magazine{id}")
    private Magazine getMagazinesById(@PathVariable Long id){

        return magazineCatalogService.getMagazineById(id).get();
    }

}
