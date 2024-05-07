package hw11objectinheritance.hw11;

// Třída Student dědící od Osoby
public class Student extends Osoba {
    // Atributy navíc
    private String cisloStudenta;
    private String obor;

    // Konstruktor
    public Student(String jmeno, int vek, String cisloStudenta, String obor) {
        super(jmeno, vek);
        this.cisloStudenta = cisloStudenta;
        this.obor = obor;
    }

    // Přetěžená metoda pro získání informací o studentovi
    @Override
    public String getJmeno() {
        return super.getJmeno() + ", " + cisloStudenta + ", " + obor;
    }

    // Přetěžená metoda pro získání věku studenta
    @Override
    public int getVek() {
        return super.getVek();
    }
}
