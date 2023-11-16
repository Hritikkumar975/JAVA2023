// Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay. in concept oop
import java.time.LocalDateTime;

public class Airplane {
    private String flightNumber;
    private String destination;
    private LocalDateTime departureTime;
    private boolean isDelayed;

    // Constructor
    public Airplane(String flightNumber, String destination, LocalDateTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.isDelayed = false;
    }

    // Getter methods
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    // Method to check flight status
    public String checkFlightStatus() {
        if (isDelayed) {
            return "Flight " + flightNumber + " to " + destination + " is delayed.";
        } else {
            return "Flight " + flightNumber + " to " + destination + " is on time.";
        }
    }

    // Method to delay the flight
    public void delayFlight() {
        isDelayed = true;
        System.out.println("Flight " + flightNumber + " to " + destination + " is delayed.");
    }

    // Method to get information about the flight
    public String getFlightInfo() {
        return "Flight Number: " + flightNumber +
                "\nDestination: " + destination +
                "\nDeparture Time: " + departureTime +
                "\nStatus: " + (isDelayed ? "Delayed" : "On time");
    }

    public static void main(String[] args) {
        // Example usage
        LocalDateTime departure = LocalDateTime.of(2023, 11, 20, 9, 30);
        Airplane flight1 = new Airplane("FL123", "New York", departure);

        System.out.println(flight1.getFlightInfo());

        // Check flight status
        System.out.println(flight1.checkFlightStatus());

        // Delay the flight
        flight1.delayFlight();

        // Check flight status after delay
        System.out.println(flight1.checkFlightStatus());
    }
}
