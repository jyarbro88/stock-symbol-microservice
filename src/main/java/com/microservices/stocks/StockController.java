package com.microservices.stocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = {"/stockSymbolKey"})
public class StockController {

    private final StockRepository stockRepository;

    @Autowired
    public StockController(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @GetMapping(produces = {"application/json"})
    @ResponseBody
    public List<StockModel> listAllStockSymbolsAndNames() {

        return stockRepository.findAll();
    }

    @GetMapping(
            value = {"/{stockId}"},
            produces = {"application/json"})
    @ResponseBody
    public Optional<StockModel> findSymbolById(
            @PathVariable(name = "stockId") Long stockId
    ) {
        return stockRepository.findById(stockId);
    }
}
