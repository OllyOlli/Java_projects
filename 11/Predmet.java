package cz.robodreams.javadeveloper.homeworks.hw11objectinheritance.hw11;

// Třída Predmet
public class Predmet {

    // Atributy
    private String nazev;
    private String kodPredmetu;
    private Zamestnanec ucitel;

    // Konstruktor
    public Predmet(String nazev, String kodPredmetu, Zamestnanec ucitel) {
        this.nazev = nazev;
        this.kodPredmetu = kodPredmetu;
        this.ucitel = ucitel;
    }

    // Metody pro získání a nastavení hodnot atributů
    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getKodPredmetu() {
        return kodPredmetu;
    }

    public void setKodPredmetu(String kodPredmetu) {
        this.kodPredmetu = kodPredmetu;
    }

    public Zamestnanec getUcitel() {
        return ucitel;
    }

    public void setUcitel(Zamestnanec ucitel) {
        this.ucitel = ucitel;
    }

    // Metoda pro popis předmětu
    public void popisPredmetu() {
        System.out.println("Předmět: " + nazev);
        System.out.println("Kód předmětu: " + kodPredmetu);
        System.out.println("Učitel: " + ucitel.getJmeno());
    }
}