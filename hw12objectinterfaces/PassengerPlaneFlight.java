package cz.robodreams.javadeveloper.homeworks.hw12objectinterfaces;

public class CargoPlaneFlight extends AbstractAircraftFlight {
    private double maxCargoWeight;
    private String cargoType;
    private String destination; // Přidáno pro CargoPlaneFlight

    public CargoPlaneFlight(String aircraftNumber, int passengerCount, double maxCargoWeight, String cargoType, String airportName, String destination) {
        super(aircraftNumber, passengerCount, airportName);
        this.maxCargoWeight = maxCargoWeight;
        this.cargoType = cargoType;
        this.destination = destination;
    }

    @Override
    public String getDestination() {
        return destination; // Vrací skutečné cílové místo letu pro nákladní letadla
    }
}