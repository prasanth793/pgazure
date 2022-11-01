package com.example.pgazure.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    @Id
    @Column(name="sku_id")
    private String skuId;
    @Column(name="name")
    private String name;
    @Column(name="min_cost")
    private String minCost;

    public Product() {
    }

    public Product(String skuId, String name, String minCost) {
        this.skuId = skuId;
        this.name = name;
        this.minCost = minCost;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMinCost() {
        return minCost;
    }

    public void setMinCost(String minCost) {
        this.minCost = minCost;
    }
}
