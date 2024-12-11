package HandlingExceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramWithExceptions {
    public static void main(String[] args) {
        // EXCEPTION HANDLING IN JAVA

        // An exception is a runtime error that disrupts the normal flow of a program.
        // All exceptions inherit from the Exception class.

        // There are two main types of exceptions:
        // 1. Unchecked Exceptions: Do not need to be explicitly handled (e.g., RuntimeException).
        // 2. Checked Exceptions: Must be handled explicitly (e.g., IOException).

        // A try block is used to wrap code that might throw an exception.
        // A try block must be followed by either a catch block or a finally block, or both.

        // The most specific catch block should be placed first, followed by more general catch blocks.
        // If not followed, it results in a compile-time error.

        Scanner s = new Scanner(System.in);
        int sum = 0;
        int quotient = 0;
        int[] nums = { 1, 2, 3, 4 };

        // Example of ArrayIndexOutOfBoundsException
        // This loop will throw an ArrayIndexOutOfBoundsException as it tries to access an index that is out of bounds.
        try {
            for (int i = 0; i <= nums.length; i++) {
                System.out.println(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }

        // Example of Exception Handling
        try {
            System.out.println("Enter the value of a: ");
            int a = s.nextInt();
            System.out.println("Enter the value of b: ");
            int b = s.nextInt();

            sum = a + b;
            quotient = a / b; // May cause ArithmeticException if b is zero
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
            e.printStackTrace();
        }

        // The finally block is always executed, regardless of whether an exception is thrown or not.
        finally {
            System.out.println("I am always executed.");
        }

        // Display results
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The quotient of the two numbers is: " + quotient);

        // Close the Scanner object
        s.close();
    }
}

/*
 * EXCEPTIONS:
 * Exceptions are events that occur during the execution of a program and disrupt its normal flow.
 * When an exception occurs, an object is created and handed off to the runtime system. This object contains
 * information about the error, including its type and the state of the program when the error occurred.
 * Throwing an exception is the process of creating and handing off an exception object.
 * 
 * Exception Hierarchy:
 * Object >>> Throwable >>> Exception >>> RuntimeException (Unchecked), Others (Checked, e.g., IOException, SQL Exception)
 * 
 * Common Exceptions:
 * 1. ArithmeticException - Example: Division by zero
 * 2. ArrayIndexOutOfBoundsException - Example: Accessing an invalid index in an array
 * 3. NullPointerException - Example: Dereferencing a null object
 * 4. NumberFormatException - Example: Parsing an invalid number format
 * 5. RuntimeException - The base class for unchecked exceptions
 * 
 * Try-Catch Syntax:
 * try {
 *     // Code that may throw an exception
 * } catch (ExceptionType e) {
 *     // Code to handle the exception
 * }
 */
