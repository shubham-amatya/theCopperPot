package com.demo.TheCopperPot.Models;

import javax.persistence.*;

@Entity
@Table
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long itemId;
    private String itemName;
    private Double itemPrice;
    private Integer discountPercentage;


    public Item(){}

    public Item(String itemname, Double itemprice, Integer discountpercentage){
        this.itemName = itemname;
        this.itemPrice = itemprice;
        this.discountPercentage = discountpercentage;
    }


    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
