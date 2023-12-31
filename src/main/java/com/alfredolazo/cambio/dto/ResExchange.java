package com.alfredolazo.cambio.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ResExchange extends ReqExchange {
    private BigDecimal amountTypeExchange;
    private BigDecimal exchangeRate;
}