package cz.robodreams.javadeveloper.homeworks.hw12objectinterfaces;

public class CargoPlaneFlight extends AbstractAircraftFlight {
    // Atributy pro maximální váhu nákladu a typ nákladu
    private double maxCargoWeight;
    private String cargoType;

    private String destination;

    // Konstruktor pro nastavení atributů včetně volání konstruktoru rodičovské třídy
    public CargoPlaneFlight(String aircraftNumber, int passengerCount, double maxCargoWeight, String cargoType, String airportName, String destination) {
        super(aircraftNumber, passengerCount, airportName);
        this.maxCargoWeight = maxCargoWeight;
        this.cargoType = cargoType;
        this.destination = destination;
    }

    // Implementace metody z rozhraní Flight pro cílové místo letu
    @Override
    public String getDestination() {
        return destination;
    }
}