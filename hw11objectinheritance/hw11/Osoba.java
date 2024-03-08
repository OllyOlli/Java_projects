package cz.robodreams.javadeveloper.homeworks.hw11objectinheritance.hw11;

// Třída Osoba
public class Osoba {
    // Atributy
    private String jmeno;
    private int vek;

    // Konstruktor
    public Osoba(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    // Metody pro získání a nastavení hodnot atributů
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }
}
