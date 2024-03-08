package cz.robodreams.javadeveloper.homeworks.hw15exceptions.exceptions;
//
import java.io.IOException;

/**
 * Vyjímka označující neexistenci souboru.
 */
public class FileIsNotPresent extends IOException {

    private final String filePath;

    public FileIsNotPresent(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}