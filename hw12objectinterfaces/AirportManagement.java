package hw12objectinterfaces;

import java.util.ArrayList;
import java.util.List;
public class AirportManagement {
    public static void main(String[] args) {
        // Seznam letů
        List<Flight> flights = new ArrayList<>();

        // Přidání nového osobního letadla do seznamu
        flights.add(new PassengerPlaneFlight("A555", 150, 200, "Economy","Heathrow Airport"));
        flights.add(new PassengerPlaneFlight("A111", 200, 200, "Economy","Charles de Gaulle"));
        flights.add(new PassengerPlaneFlight("T222", 50, 100, "Business","Amsterdam"));
        flights.add(new PassengerPlaneFlight("T333", 30, 50, "Business","Frankfurt am Main"));


        // Přidání nového nákladního letadla do seznamu
        flights.add(new CargoPlaneFlight("C456", 0, 5000.0, "Goods", "Prague"));
        flights.add(new CargoPlaneFlight("C444", 0, 3000.0, "Flowers", "Istanbul"));
        flights.add(new CargoPlaneFlight("D555", 0, 7000.0, "Animals", "Madrid"));
        flights.add(new CargoPlaneFlight("D456", 0, 9000.0, "Goods", "Barcelona"));


        // Výpis informací o letech
        for (Flight flight : flights) {
            System.out.println("Flight Number: " + flight.getFlightNumber());
            System.out.println("Destination: " + flight.getDestination());
            System.out.println("Passenger Count: " + flight.getPassengerCount());
            System.out.println("------------------------");
        }
    }
}
