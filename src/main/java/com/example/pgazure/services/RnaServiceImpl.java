package com.example.pgazure.services;

import com.example.pgazure.data.Rna;
import com.example.pgazure.repo.IRna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RnaServiceImpl  implements RnaServiceInterface{

    @Autowired
    private IRna iRna;

    @Override
    public Rna findById(Integer id) {
        return iRna.findById(id).get();
    }

    public Iterable<Rna> save(Rna rna){
        iRna.save(rna);
        var updatedRna = iRna.findAll();
        return updatedRna;

    };
}
