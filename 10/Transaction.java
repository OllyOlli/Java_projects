package cz.robodreams.javadeveloper.homeworks.hw10objectbasic;

import java.util.Objects;

// Definice třídy Transaction
public class Transaction {

        // Atributy třídy
        private long id;
        private String accountFrom;
        private String accountTo;

        // Konstruktor třídy Transaction pro inicializaci atributů při vytvoření instance
        public Transaction(long id, String accountFrom, String accountTo) {
            this.id = id;
            this.accountFrom = accountFrom;
            this.accountTo = accountTo;
        }

        // Metoda pro získání hodnoty atributu 'id'
        public long getId() {
            return id;
        }

        // Metoda pro získání hodnoty atributu 'accountFrom'
        public String getAccountFrom() {
            return accountFrom;
        }

        // Metoda pro nastavení hodnoty atributu 'accountFrom'
        public void setAccountFrom(String accountFrom) {
            this.accountFrom = accountFrom;
        }

        // Metoda pro získání hodnoty atributu 'accountTo'
        public String getAccountTo() {
            return accountTo;
        }

        // Metoda pro nastavení hodnoty atributu 'accountTo'
        public void setAccountTo(String accountTo) {
            this.accountTo = accountTo;
        }

        // Přepsaná metoda equals pro porovnání dvou instancí třídy Transaction
        @Override
        public boolean equals(Object o) {
            if (this == o) return true; // Pokud jsou to stejné instance, jsou rovny
            if (!(o instanceof Transaction that)) return false; // Pokud objekt není instance třídy Transaction, nejsou rovny
            return getId() == that.getId(); // Porovnání hodnot atributu 'id' obou instancí
        }

        // Přepsaná metoda hashCode pro výpočet kódu hash na základě atributu 'id'
        @Override
        public int hashCode() {
            return Objects.hash(getId()); // Výpočet kódu hash pomocí metody hash z třídy Objects
        }
    }
