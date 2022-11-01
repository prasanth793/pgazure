package com.example.pgazure.repo;

import com.example.pgazure.data.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduct extends CrudRepository<Product,String> {
}
