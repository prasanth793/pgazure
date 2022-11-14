package com.example.pgazure.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "rna")
public class Rna {


    @Column
    @Id
    private int id;
    @Column
    private String upi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUpi() {
        return upi;
    }

    public void setUpi(String upi) {
        this.upi = upi;
    }

    public Rna(int id, String upi) {
        this.id = id;
        this.upi = upi;
    }

    public Rna() {
    }
}
