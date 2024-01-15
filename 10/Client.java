package cz.robodreams.javadeveloper.homeworks.hw10objectbasic;

import java.util.ArrayList;
import java.util.List;

// Definice třídy Client
public class Client {

    // Atributy třídy
    private String name;
    private String address;
    private List<BankAccount> bankAccountList = new ArrayList<BankAccount>();  // Inicializace seznamu bankovních účtů

    // Konstruktor třídy Client pro inicializaci atributů při vytvoření instance
    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Metoda pro získání hodnoty atributu 'name'
    public String getName() {
        return name;
    }

    // Metoda pro nastavení hodnoty atributu 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Metoda pro získání hodnoty atributu 'address'
    public String getAddress() {
        return address;
    }

    // Metoda pro nastavení hodnoty atributu 'address'
    public void setAddress(String address) {
        this.address = address;
    }

    // Metoda pro přidání bankovního účtu do seznamu
    public void addBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    // Metoda pro odstranění bankovního účtu ze seznamu
    public void removeBankAccount(BankAccount bankAccount) {
        bankAccountList.remove(bankAccount);
    }

    // Metoda pro získání úvodního textu
    public String getIntroduction() {
        // Vytiskne informace o klientovi
        System.out.printf("Name: %s, \nAddress: %s", name, address);
        return null;  // Návratová hodnota je null, může být změněna podle potřeby
    }

    // Metoda pro výpis informací o klientovi
    public void introduce() {
        System.out.printf("Hello, my name is %s and my details are: \n%s\n", name, getIntroduction());
    }
}
