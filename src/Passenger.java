public class Passenger {

    // --- Attributes ---
    private String name;
    private String passportNumber;

    // --- Constructors ---
    public Passenger() {
    }

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    // --- Getters and Setters ---
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    // --- Methods ---
    public void printInfo() {
        System.out.println("Passenger → Name: " + name +
                ", Passport: " + passportNumber);
    }
}

