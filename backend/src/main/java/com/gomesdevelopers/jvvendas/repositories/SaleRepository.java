package com.gomesdevelopers.jvvendas.repositories;

import com.gomesdevelopers.jvvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
}
