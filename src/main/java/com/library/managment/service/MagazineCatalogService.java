package com.library.managment.service;

import com.library.managment.entity.Book;
import com.library.managment.entity.Magazine;
import com.library.managment.repository.BookCatalogServiceRepository;
import com.library.managment.repository.MagazineCatalogServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MagazineCatalogService {

    @Autowired
    MagazineCatalogServiceRepository magazineCatalogServiceRepository;

    public Magazine saveMagazine(Magazine magazine){
        return magazineCatalogServiceRepository.save(magazine);
    }

    public List<Magazine> getAllMagazines(){
        return magazineCatalogServiceRepository.findAll();
    }

    public Optional<Magazine> getMagazineById(Long id){
        return magazineCatalogServiceRepository.findById(id);
    }
    public void deleteById(Long Id){
        magazineCatalogServiceRepository.deleteById(Id);
    }
}
