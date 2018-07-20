package com.microservices.stocks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableAutoConfiguration(exclude = {
//        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class StocksApplication {

    public static void main(String[] args) {

        SpringApplication.run(StocksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StockRepository stockRepository) throws Exception {

        return args -> {
            stockRepository.save(new StockModel((long) 1, "AAPL", "Apple"));
            stockRepository.save(new StockModel((long)2, "GOOG", "Google"));
            stockRepository.save(new StockModel((long)3, "MSFT", "Microsoft"));
            stockRepository.save(new StockModel((long)4, "PVTL", "Pivotal"));
            stockRepository.save(new StockModel((long)5, "AMZN", "Amazon"));
        };
    }
}
