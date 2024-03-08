package cz.robodreams.javadeveloper.homeworks.hw12objectinterfaces;

public interface Flight {
    // Rozhraní pro reprezentaci letů
        String getFlightNumber(); // Metoda vrátí číslo letu
        String getDestination(); // Metoda vrátí cílové místo letu
        int getPassengerCount(); // Metoda vrátí počet cestujících na letu
}
