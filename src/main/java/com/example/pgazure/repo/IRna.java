package com.example.pgazure.repo;


import com.example.pgazure.data.Rna;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//@Repository
public interface IRna extends CrudRepository<Rna,Integer> {

//    @Query(value = "select r.id,r.upi from Rna r where r.id=?1")
//    Optional<Rna> findById(Integer id);

}
