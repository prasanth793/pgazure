package com.example.pgazure.controllers;

import com.example.pgazure.data.Product;
import com.example.pgazure.data.Rna;
import com.example.pgazure.services.ProductService;
import com.example.pgazure.services.ProductServiceInterface;
import com.example.pgazure.services.RnaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.List;

@RestController
public class ViewController {

    @Autowired
    private ProductServiceInterface productService;

    @Autowired
    private RnaServiceImpl rnaService;

    @Value("${spring.custom.prop}")
    private String customProp;

    @GetMapping("/")
    String homePage(){
        return customProp;
    }

    @GetMapping("/{id}")
    Rna getAll(@PathVariable Integer id){
        return rnaService.findById(id);
    }

    @GetMapping("/save/{id}/{upi}")
    Iterable<Rna> saveRna(@PathVariable Integer id, @PathVariable String upi){

        var res = rnaService.save(new Rna(id, upi));

        return res;
    }



}
