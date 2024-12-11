package HandlingExceptions;
//to create a user defined exception in java, create a class that extends Exception class

public class InvalidRadiusExpection extends Exception {

    public InvalidRadiusExpection(String message) {
        super(message);
    }
}
