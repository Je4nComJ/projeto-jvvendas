package com.gomesdevelopers.jvvendas.services;

import com.gomesdevelopers.jvvendas.dto.SellerDTO;
import com.gomesdevelopers.jvvendas.entities.Seller;
import com.gomesdevelopers.jvvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
       List<Seller> result = repository.findAll();
       return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
