///
package cz.robodreams.javadeveloper.homeworks.hw15exceptions;

import cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions.FilesIsNotPresent;
import java.io.IOException;

/**
 * Rozhraní pro řízení přístupu k souborům.
 */
public interface ControlAccess {

    /**
     * Uloží data do souboru
     *
     * @param pathToFile cesta k souboru
     * @return textový popis operace
     * @throws IOException           pokud dojde k chybě při práci se souborem
     */
    String storeToFile(String pathToFile) throws IOException;

    /**
     * Načte data ze souboru.
     *
     * @param pathToFile cesta k souboru
     * @throws FilesIsNotPresent pokud soubor není k dispozici
     */
    void loadFromFile(String pathToFile) throws FilesIsNotPresent;
}
