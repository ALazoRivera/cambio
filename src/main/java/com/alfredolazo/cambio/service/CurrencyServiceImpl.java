package com.alfredolazo.cambio.service;

import com.alfredolazo.cambio.entity.Currency;
import com.alfredolazo.cambio.repository.CurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService {

    private final CurrencyRepository currencyRepository;

    @Override
    public List<Currency> listAllCurrency() {
        return currencyRepository.findAll();
    }
}

