package com.microservices.stocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<StockModel, Long> {

    Optional<StockModel> findStockModelBySymbol(String symbol);
}
