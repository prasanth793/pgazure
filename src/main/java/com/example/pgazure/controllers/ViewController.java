package com.example.pgazure.controllers;

import com.example.pgazure.data.Product;
import com.example.pgazure.data.Rna;
import com.example.pgazure.services.ProductService;
import com.example.pgazure.services.ProductServiceInterface;
import com.example.pgazure.services.RnaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

    @Autowired
    private ProductServiceInterface productService;

    @Autowired
    private RnaServiceImpl rnaService;

    @GetMapping("/{id}")
    Rna getAll(@PathVariable Integer id){
        return rnaService.findById(id);
    }
}
