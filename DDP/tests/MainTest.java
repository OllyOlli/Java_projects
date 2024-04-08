package cz.robodreams.javadeveloper.homeworks.hw21junits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testMain() {
        Main.main(new String[]{});
        String expectedOutput = "Kupec benátský - William Shakespeare - BELETRIE\n" +
                "Sen noci svatojánské - William Shakespeare - BELETRIE\n" +
                "Hamlet - William Shakespeare - BELETRIE\n" +
                "Mackbet - William Shakespeare - BELETRIE\n" +
                "Učebnice jazyka Java - Pavel Herout - ODBORNE\n" +
                "Java a XML - Pavel Herout - ODBORNE\n" +
                "How Linux Works - Ward Brian - ODBORNE\n" +
                "Kali Linux Penetration Testing Bible - Unknown - ODBORNE\n" +
                "Malý princ - Antoine de Saint-Exupéry - POHADKA\n" +
                "Honzíkova cesta - Bohumil Říha - POHADKA\n" +
                "Povídání o pejskovi a kočičce - Josef Čapek - POHADKA\n" +
                "Users:\n" +
                "Jan Novák\n" +
                "Václav Novotný\n" +
                "Pavel Dvořák\n" +
                "Vladimír Černý\n" +
                "Iva Modrá\n" +
                "Eva Nová\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
