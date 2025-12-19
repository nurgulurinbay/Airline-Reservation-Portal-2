public class Main {

    public static void main(String[] args) {

        Flight flight1 = new Flight("FL101", 5);
        Flight flight2 = new Flight("FL202", 2);

        Passenger passenger1 = new Passenger("Nurgul", "P12345");
        Passenger passenger2 = new Passenger("Nurislam", "P67890");

        Booking booking1 = new Booking(flight1, passenger1);
        Booking booking2 = new Booking(flight2, passenger2);

        System.out.println("=== FLIGHTS & PASSENGERS ===");
        flight1.printInfo();
        flight2.printInfo();
        passenger1.printInfo();
        passenger2.printInfo();

        System.out.println("\n=== FLIGHT COMPARISON ===");

        if (flight1.getAvailableSeats() > flight2.getAvailableSeats()) {
            System.out.println("Flight 1 has more available seats than Flight 2.");
        } else if (flight1.getAvailableSeats() < flight2.getAvailableSeats()) {
            System.out.println("Flight 2 has more available seats than Flight 1.");
        } else {
            System.out.println("Both flights have the same number of seats.");
        }

        System.out.println("\n=== CONFIRM BOOKINGS ===");
        booking1.confirmBooking();
        booking2.confirmBooking();

        flight1.printInfo();
        flight2.printInfo();

        System.out.println("\n=== LOOP THROUGH FLIGHTS ===");

        Flight[] flights = { flight1, flight2 };
        int totalSeats = 0;

        for (int i = 0; i < flights.length; i++) {
            int seats = flights[i].getAvailableSeats();
            System.out.println("Flight " + (i + 1) + " seats: " + seats);
            totalSeats += seats;
        }

        System.out.println("Total available seats: " + totalSeats);
    }
}
