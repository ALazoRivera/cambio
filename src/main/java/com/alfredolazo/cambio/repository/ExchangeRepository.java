package com.alfredolazo.cambio.repository;

import com.alfredolazo.cambio.dto.ReqExchange;
import com.alfredolazo.cambio.entity.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExchangeRepository extends JpaRepository<Exchange, Long> {
    @Query("select e from Exchange e " +
            "where e.currency_change_from = :#{#exchange.currencyFrom} " +
            "and e.currency_change_to = :#{#exchange.currencyTo}")
    Exchange finExchangedByCurrencyChangeFromAndCurrencyChangeTo(@Param("exchange") ReqExchange exchange);

    @Query("select e from Exchange e " +
            "where e.currency_change_from = :#{#exchangeId} ")
    List<Exchange> findExchangeByCurrencyChangeFrom(@Param("exchangeId") Long exchangeId);
}
