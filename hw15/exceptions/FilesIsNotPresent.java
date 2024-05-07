package hw15exceptions.exceptions;

import java.io.IOException;

/**
 * Vyjímka označující neexistenci souboru.
 */
public class FilesIsNotPresent extends IOException {

    private final String filePath;

    public FilesIsNotPresent(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
