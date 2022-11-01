package com.example.pgazure.services;

import com.example.pgazure.data.Product;
import com.example.pgazure.repo.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductServiceInterface{

    @Autowired
    private IProduct iProduct;

    @Override
    public Iterable<Product> findAll() {
        return iProduct.findAll();
    }
}
