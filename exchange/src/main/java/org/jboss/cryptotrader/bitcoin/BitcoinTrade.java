package org.jboss.cryptotrader.bitcoin;

import java.math.BigDecimal;

import javax.json.bind.annotation.JsonbAnnotation;

@JsonbAnnotation
public class BitcoinTrade {

    private String name;
    private String bankAccountNo;
    private BigDecimal units;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public BigDecimal getUnits() {
        return units;
    }

    public void setUnits(BigDecimal units) {
        this.units = units;
    }
}
