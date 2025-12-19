public class Flight {

    // --- Attributes ---
    private String flightNumber;
    private int availableSeats;

    // --- Constructors ---
    public Flight() {
    }

    public Flight(String flightNumber, int availableSeats) {
        this.flightNumber = flightNumber;
        this.availableSeats = availableSeats;
    }

    // --- Getters and Setters ---
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // --- Methods ---
    public void reserveSeat() {
        if (availableSeats > 0) {
            availableSeats--;
        }
    }

    public void printInfo() {
        System.out.println("Flight → Number: " + flightNumber +
                ", Seats: " + availableSeats);
    }
}
