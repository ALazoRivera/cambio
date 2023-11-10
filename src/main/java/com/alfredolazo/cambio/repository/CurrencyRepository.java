package com.alfredolazo.cambio.repository;

import com.alfredolazo.cambio.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
