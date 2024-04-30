package cz.robodreams.javadeveloper.homeworks.hw21junits;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMainOutput() {
        // Uložení původního systémového výstupu
        PrintStream originalOut = System.out;
        // Příprava pro zachycení systémového výstupu
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Spuštění hlavní metody aplikace
        Main.main(new String[0]);

        // Očekávaný výstup
        String expectedOutput = "Uživatelé:\nJan Novák\nVáclav Novotný\nPavel Dvořák\nVladimír Černý\nIva Modrá\nEva Nová\n";

        // Ověření, že výstup na konzoli obsahuje očekávaný výpis
        assertEquals(expectedOutput, outputStreamCaptor.toString());

        // Obnovení původního systémového výstupu
        System.setOut(originalOut);
    }
}
