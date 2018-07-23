package com.microservices.stocks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class StocksApplication {

    public static void main(String[] args) {

        SpringApplication.run(StocksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StockRepository stockRepository) throws Exception {

        return args -> {
            stockRepository.save(new StockModel("1", "AAPL", "Apple"));
            stockRepository.save(new StockModel("2", "GOOG", "Google"));
            stockRepository.save(new StockModel("3", "MSFT", "Microsoft"));
            stockRepository.save(new StockModel("4", "PVTL", "Pivotal"));
            stockRepository.save(new StockModel("5", "AMZN", "Amazon"));
        };
    }
}
