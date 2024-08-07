package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private Long securityId;

    @Column
    private Long portfolioId;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private Long purchasePrice;

    @Column
    private String purchaseDate;

    @Column
    private int quantity;

    protected Security() {

    }

    public Security(Long portfolioId, String name, String category, Long purchasePrice, String purchaseDate, int quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Long getPortfolioId(){
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId){
        this.portfolioId = portfolioId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public Long getPurchasePrice(){
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseDate(){
        return purchaseDate;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

}
