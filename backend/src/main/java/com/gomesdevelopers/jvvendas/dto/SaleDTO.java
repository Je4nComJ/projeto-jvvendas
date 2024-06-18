package com.gomesdevelopers.jvvendas.dto;

import com.gomesdevelopers.jvvendas.entities.Sale;

import java.time.LocalDate;

public class SaleDTO {

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO seller;

    public SaleDTO(){}

    public SaleDTO(Long id, SellerDTO seller, LocalDate date, Double amount, Integer deals, Integer visited) {
        this.id = id;
        this.seller = seller;
        this.date = date;
        this.amount = amount;
        this.deals = deals;
        this.visited = visited;
    }
    public SaleDTO(Sale entity) {
        id = entity.getId();
        seller = new SellerDTO(entity.getSeller());
        date = entity.getDate();
        amount = entity.getAmount();
        deals = entity.getDeals();
        visited = entity.getVisited();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SellerDTO getSeller() {
        return seller;
    }

    public void setSeller(SellerDTO seller) {
        this.seller = seller;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }
}
