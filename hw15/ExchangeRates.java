package cz.robodreams.javadeveloper.homeworks.hw15exceptions;

import cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions.CurrencyNotFoundException;
import cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions.TimeNotAvailableException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementace směnárny
 */
public class ExchangeRates implements Exchange {

    private final Map<LocalDate, Map<String, BigDecimal>> exchangeRates; // Mapování data na měnové kurzy

    public ExchangeRates() {
        this.exchangeRates = new HashMap<>();
    }

    @Override
    public void addExchangeRate(ExchangeRecord exchangeRecord) {
        LocalDate day = exchangeRecord.day();
        String currency = exchangeRecord.currency();
        BigDecimal pricePerCurrency = exchangeRecord.pricePerCurrency();

        // Pokud není mapa pro daný den vytvořena, vytvoříme ji
        exchangeRates.computeIfAbsent(day, k -> new HashMap<>());

        // Přidání směnného kurzu
        exchangeRates.get(day).put(currency, pricePerCurrency);
    }

    @Override
    public BigDecimal convert(int input, String currency) throws CurrencyNotFoundException, TimeNotAvailableException {
        return convert(LocalDate.now(), input, currency);
    }

    @Override
    public BigDecimal convert(LocalDate day, int input, String currency) throws CurrencyNotFoundException, TimeNotAvailableException {
        // Zkontrolujeme, zda je k dispozici kurz pro daný den
        if (!exchangeRates.containsKey(day)) {
            throw new TimeNotAvailableException("No exchange rate available for the given day: " + day);
        }

        // Zkontrolujeme, zda je k dispozici kurz pro danou měnu
        Map<String, BigDecimal> ratesForDay = exchangeRates.get(day);
        if (!ratesForDay.containsKey(currency)) {
            throw new CurrencyNotFoundException("Currency not found: " + currency);
        }

        // provedeme převod
        BigDecimal rate = ratesForDay.get(currency);
        return BigDecimal.valueOf(input).multiply(rate).setScale(0, BigDecimal.ROUND_DOWN);
    }
}
