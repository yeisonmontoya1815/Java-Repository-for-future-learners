import java.util.Scanner;

public class Vehicle {
    String make;
    String model;
    String year;
    String license_plate_number;

    // Constructor to set default make
    Vehicle() {
        make = "Honda";
    }

    // Parametrized constructors...

    // 2 args constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // 3 args constructor
    public Vehicle(String make, String model, String year) {
        this(make, model);
        this.year = year;
    }

    // 4 args constructor
    public Vehicle(String make, String model, String year, String license_plate_number) {
        this(make, model, year);
        this.license_plate_number = license_plate_number;
    }

    // Method to display vehicle details
    static void display(Vehicle v) {
        System.out.println("The make is: " + v.make);
        System.out.println("The model is: " + v.model);
        System.out.println("The year is: " + v.year);
        System.out.println("The license plate is: " + v.license_plate_number);
    }

    // Overriding toString method for custom string representation
    @Override
    public String toString() {
        return "The name of the car is: " + make + "\n" +
                "The model is: " + model + "\n" +
                "The year is: " + year + "\n" +
                "The license plate is: " + license_plate_number;
    }

    // Method for entering details
    static Vehicle enterDetails() {
        Vehicle c = new Vehicle();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the make of the car: ");
        c.make = input.nextLine();

        System.out.println("Enter the model of the car: ");
        c.model = input.nextLine();

        System.out.println("Enter the year of the car: ");
        c.year = input.nextLine();

        System.out.println("Enter the license plate of the car: ");
        c.license_plate_number = input.nextLine();

        System.out.print("Enter your choice: \n" +
                         "1 for creating a vehicle with make and model\n" +
                         "2 for creating a vehicle with make, model, and year\n" +
                         "3 for creating a vehicle with make, model, year, and license plate: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                return new Vehicle(c.make, c.model);
            case 2:
                return new Vehicle(c.make, c.model, c.year);
            case 3:
                return new Vehicle(c.make, c.model, c.year, c.license_plate_number);
            default:
                return null; // Invalid choice, returning null
        }
    }

    public static void main(String[] args) {
        // Entering vehicle details
        Vehicle myCar = enterDetails();

        // Displaying vehicle details using toString method
        System.out.println(myCar);

        // Displaying vehicle details using display method
        display(myCar);
    }
}
