package cz.robodreams.javadeveloper.homeworks.hw15exceptions;
//
import java.math.BigDecimal;
import java.time.LocalDate;

public record ExchangeRecord(String currency, BigDecimal pricePerCurrency, LocalDate day)  {
}
