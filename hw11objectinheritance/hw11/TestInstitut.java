package cz.robodreams.javadeveloper.homeworks.hw11objectinheritance.hw11;

// Třída TestInstitut pro testování
public class TestInstitut {
    public static void main(String[] args) {
        // Vytvoření instance studenta
        Student student = new Student("Jan Novak", 20, "S123", "Informatika");

        // Vytvoření instance zaměstnance
        Zamestnanec zamestnanec = new Zamestnanec("Pavel Novotny", 50, "Z456", "Výzkumník");

        // Vytvoření instance předmětu
        Predmet predmet = new Predmet("Programování", "PRG101", zamestnanec);

        // Výpis informací o studentovi, zaměstnanci a předmětu
        System.out.println("Informace o studentovi: " + student.getJmeno() + ", Věk: " + student.getVek());
        System.out.println("Informace o zaměstnanci: " + zamestnanec.getJmeno() + ", Věk: " + zamestnanec.getVek());
        predmet.popisPredmetu();
    }
}