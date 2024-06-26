package com.gomesdevelopers.jvvendas.dto;

import com.gomesdevelopers.jvvendas.entities.Seller;

import java.io.Serializable;

public class SaleSuccessDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(){}

    public SaleSuccessDTO(Seller seller, Long deals, Long visited) {
       sellerName = seller.getName();
        this.deals = deals;
        this.visited = visited;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
