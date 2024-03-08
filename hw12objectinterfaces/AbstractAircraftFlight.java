package cz.robodreams.javadeveloper.homeworks.hw12objectinterfaces;

// Abstraktní třída pro implementaci rozhraní Flight
public abstract class AbstractAircraftFlight implements Flight {
    // Atributy pro číslo letadla a aktuální počet cestujících
    protected String aircraftNumber;
    protected String destination;
    protected int passengerCount;
    protected String airportName;


    // Konstruktor pro nastavení atributů
    public AbstractAircraftFlight(String aircraftNumber, int passengerCount) {
        this.aircraftNumber = aircraftNumber;
        this.passengerCount = passengerCount;
        this.airportName = airportName;
        this.destination = destination;
    }

    // Implementace metod z rozhraní Flight
    @Override
    public String getFlightNumber() {
        return aircraftNumber;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public int getPassengerCount() {
        return passengerCount;
    }
}
