public class Booking {

    // --- Attributes ---
    private Flight flight;
    private Passenger passenger;

    // --- Constructors ---
    public Booking() {
    }

    public Booking(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    // --- Getters and Setters ---
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    // --- Methods ---
    public void confirmBooking() {
        flight.reserveSeat();
    }

    public void printInfo() {
        System.out.println("Booking confirmed:");
        passenger.printInfo();
        flight.printInfo();
    }
}

