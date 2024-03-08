package cz.robodreams.javadeveloper.homeworks.hw11objectinheritance.hw11;

// Třída Zamestnanec dědící od Osoby
public class Zamestnanec extends Osoba {
    // Atributy
    private String cisloZamestnance;
    private String pozice;

    // Konstruktor
    public Zamestnanec(String jmeno, int vek, String cisloZamestnance, String pozice) {
        super(jmeno, vek);
        this.cisloZamestnance = cisloZamestnance;
        this.pozice = pozice;
    }

    // Přetěžená metoda pro získání informací o zaměstnanci
    @Override
    public String getJmeno() {
        return super.getJmeno() + ", " + cisloZamestnance + ", " + pozice;
    }

    // Přetěžená metoda pro získání věku zaměstnance
    @Override
    public int getVek() {
        return super.getVek();
    }
}
