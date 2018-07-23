package com.microservices.stocks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(StockController.class)
public class StockControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testListAllStockSymbolsAndNames() {
//        this.mockMvc.perform(get("/"))
    }

    @Test
    public void listAllStockSymbolsAndNames() {
    }

    @Test
    public void findSymbolById() {
    }
}