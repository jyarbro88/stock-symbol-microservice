package com.microservices.stocks;

import com.netflix.discovery.converters.Auto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase
public class StockModelTest {

    @Autowired
    private StockRepository stockRepository;

    @Test
    public void testBuildingANewStockObject() {

        StockModel savedStockModel = stockRepository.save(new StockModel((long) 1, "BBB", "Target"));

        Optional<StockModel> stockModelToVerify = stockRepository.findById(savedStockModel.getId());

        StockModel retrievedModel = stockModelToVerify.get();

        assert(retrievedModel.getSymbol().equals(savedStockModel.getSymbol()));

    }
}