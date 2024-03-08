package cz.robodreams.javadeveloper.homeworks.hw10objectbasic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

// Definice třídy BankAccount

    // Atributy třídy
    private long id;
    private String name;
    private String accountNumber;
    private BigDecimal balance;
    private List<Transaction> transactionList = new ArrayList<Transaction>(); // Inicializace seznamu transakcí

    // Konstruktor třídy BankAccount pro vytvoření instance s počátečními hodnotami
    public BankAccount(long id, String name, String accountNumber, BigDecimal balance) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Metoda pro získání hodnoty atributu 'id'
    public long getId() {
        return id;
    }

    // Metoda pro získání hodnoty atributu 'name'
    public String getName() {
        return name;
    }

    // Metoda pro nastavení hodnoty atributu 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Metoda pro získání hodnoty atributu 'accountNumber'
    public String getAccountNumber() {
        return accountNumber;
    }

    // Metoda pro získání hodnoty atributu 'balance'
    public BigDecimal getBalance() {
        return balance;
    }

    // Metoda pro nastavení hodnoty atributu 'balance'
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    // Metoda pro vkládání peněz na účet
    public BigDecimal deposit(BigDecimal amount) {
        // Kontrola, zda je vkládaná částka kladná
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        // Přidání částky k aktuálnímu zůstatku
        balance = balance.add(amount);
        return balance;
    }

    // Metoda pro vybírání peněz z účtu
    public BigDecimal withdrawMoney(BigDecimal amount) {
        // Kontrola, zda je na účtu dostatek peněz
        if (balance.compareTo(amount) < 0) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        // Snížení částky od aktuálního zůstatku
        balance = balance.subtract(amount);
        return balance;
    }

    // Metoda pro přidání transakce do seznamu
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    // Metoda pro odstranění transakce ze seznamu
    public void removeTransaction(Transaction transaction) {
        transactionList.remove(transaction);
    }

    // Metoda pro získání informací o účtu ve formě textového řetězce
    public String getAccountInfo() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
