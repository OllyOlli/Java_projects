package cz.robodreams.javadeveloper.homeworks.hw15exceptions;

import cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions.CurrencyNotFoundException;
import cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions.TimeNotAvailableException;
//
import java.math.BigDecimal;
import java.time.LocalDate;

public interface Exchange {

    /**
     * Add exchange rate.
     *
     *
     * @param exchangeRecord
     */
    void addExchangeRate(ExchangeRecord exchangeRecord);

    /**
     *
     * Convert czech crowns to target currency (round to whole number, round down) for today
     *
     * When currency is not available then throws CurrencyNotFoundException
     * When day is not available then throws TimeNotAvailableException
     *
     *
     * @param input entry amount
     * @param currency target currency
     * @return converted currency
     */
    BigDecimal convert(int input, String currency) throws cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions.CurrencyNotFoundException, cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions.TimeNotAvailableException;

    /**
     *
     * Convert czech crowns to target currency (round to whole number, round down) for given day
     *
     * When currency is not available then throws CurrencyNotFoundException
     * When day is not available then throws TimeNotAvailableException
     *
     *
     * @param day specific amount
     * @param input entry amount
     * @param currency target currency
     * @return converted currency
     */
    BigDecimal convert(LocalDate day, int input, String currency) throws cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions.CurrencyNotFoundException, cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions.TimeNotAvailableException;

}