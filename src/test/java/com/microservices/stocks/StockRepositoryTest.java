package com.microservices.stocks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@DataJpaTest
public class StockRepositoryTest {

    @Mock
    private StockRepository stockRepository;

    @Test
    public void testSavingAStockObject() {

        StockModel testStockModel = new StockModel();

        testStockModel.setId((long) 1);
        testStockModel.setCompanyName("Target");
        testStockModel.setSymbol("TRGT");

        when(stockRepository.save(testStockModel)).thenReturn(testStockModel);

        assertEquals("TRGT", testStockModel.getSymbol());
    }
}