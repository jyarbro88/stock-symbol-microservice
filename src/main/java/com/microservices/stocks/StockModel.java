package com.microservices.stocks;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor
@Entity
class StockModel {

    @Id
    private Long id;
    private String symbol;
    private String companyName;

    StockModel(Long id, String symbol, String companyName) {
        this.id = id;
        this.symbol = symbol;
        this.companyName = companyName;
    }

}
