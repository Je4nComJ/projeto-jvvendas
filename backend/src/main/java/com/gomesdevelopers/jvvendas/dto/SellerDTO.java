package com.gomesdevelopers.jvvendas.dto;

import com.gomesdevelopers.jvvendas.entities.Seller;

import java.io.Serializable;

public class SellerDTO implements Serializable {

    private static final long seralVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDTO(){}

    public SellerDTO(String name, Long id) {
        this.name = name;
        this.id = id;
    }
    public SellerDTO(Seller entity){
        name = entity.getName();
        id = entity.getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
