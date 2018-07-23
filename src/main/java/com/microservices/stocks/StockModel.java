package com.microservices.stocks;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name = "stock_model")
class StockModel {

    @Id
    private String symbol;
    private String id;
    private String companyName;

    StockModel(String id, String symbol, String companyName) {
        this.id = id;
        this.symbol = symbol;
        this.companyName = companyName;
    }
}
