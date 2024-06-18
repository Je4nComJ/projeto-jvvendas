package com.gomesdevelopers.jvvendas.repositories;

import com.gomesdevelopers.jvvendas.dto.SaleSuccessDTO;
import com.gomesdevelopers.jvvendas.dto.SaleSumDTO;
import com.gomesdevelopers.jvvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale,Long> {

    @Query("SELECT new com.gomesdevelopers.jvvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale AS obj GROUP BY obj.seller ")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.gomesdevelopers.jvvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.deals), SUM(obj.visited)) FROM Sale AS obj GROUP BY obj.seller ")
    List<SaleSuccessDTO> successGroupedBySeller();
}
