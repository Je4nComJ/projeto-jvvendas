package com.gomesdevelopers.jvvendas.services;

import com.gomesdevelopers.jvvendas.dto.SaleDTO;
import com.gomesdevelopers.jvvendas.dto.SaleSuccessDTO;
import com.gomesdevelopers.jvvendas.dto.SaleSumDTO;
import com.gomesdevelopers.jvvendas.entities.Sale;
import com.gomesdevelopers.jvvendas.repositories.SaleRepository;
import com.gomesdevelopers.jvvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
       Page<Sale> result = repository.findAll(pageable);
       return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return repository.successGroupedBySeller();
    }

}
