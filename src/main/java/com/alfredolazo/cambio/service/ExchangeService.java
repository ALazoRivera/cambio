package com.alfredolazo.cambio.service;

import com.alfredolazo.cambio.dto.ReqExchange;
import com.alfredolazo.cambio.dto.ReqExchangeUpdate;
import com.alfredolazo.cambio.dto.ResExchange;
import com.alfredolazo.cambio.entity.Exchange;

import java.util.List;

public interface ExchangeService {
    public List<Exchange> listAllExchange();
    public List<Exchange> listExchangeById(Long exchangeId);
    public ResExchange convertAmountExchange(ReqExchange exchange);
    public Exchange updateRateExchange(Long exchangeId, ReqExchangeUpdate data);
}
