package cz.robodreams.javadeveloper.homeworks.hw15exceptions;

/**
 *
 * Naimplementujte smenarnu.
 *
 * Smenarna bude implementovat interface Exchange a ControlAccess
 *
 * Naimplementujte metody interfacu
 *
 * Vytvorte vyjimky  TimeNotAvailableException pro pripad kdy pro dany cas je neznamy kurz
 * a CurrencyNotFoundException pro neznamou (neregistrovanou) zmenu.
 * A FileIsNotPresent pro pripad neznameho souboru ( tu jen pouzijete)
 *
 *
 *
 *
 */
//
public class ExchangeSupplier {

    private static Exchange exchange;
    private ExchangeSupplier(){
    }

    /**
     * Vrátí instanci směnárny. Pokud instance neexistuje, vytvoří novou
     *
     * @return instance směnárny
     */

    public static Exchange getExchange(){
        if (exchange == null) {
//            exchange = new ExchangeRates();
        }

        return exchange;
    }

}
