package com.microservices.stocks;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockModel {

    @Id
    private Long id;
    private String symbol;
    private String companyName;

    public StockModel(Long id, String symbol, String companyName) {
        this.id = id;
        this.symbol = symbol;
        this.companyName = companyName;
    }

    public StockModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
