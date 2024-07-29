import java.util.Scanner;

public class ProgramWithExceptions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        int quotient = 0;
        
        // An exception is a runtime error
        // all the exceptions inherit from exception class
        // unchecked exceptions: can be left unhandled. will not give a compile time
        // error
        // chacek exceptions: they have to be handled. will give a compile time error

        // the lines of code whcih might cause the program to fail are placed inside the
        // try block

        // a try block is always accompained by either a catch block or a finally block
        // or both

        // I can have multiple catch options associated with the try block
        // the most specific catch bolck has to bo placed first before the general catch clause
        // if this is not followed it will compile time error
        try {
            System.out.println("Enter the value of a: ");
            int a = s.nextInt();
            System.out.println("Enter the value of b: ");
            int b = s.nextInt();

            int sum = a + b;
            int quotient = a / b;

            System.out.println("the sum of the two numbers is: " + sum);
            System.out.println("the quotient of the two numbers is: " + quotient);
        }  
        catch (Exception e) {
            System.out.println("please enter a valid integer number, a non zero value is not allowed");
        }   
    }
}

/*
 * EXCEPTIONS: are not errors, but rather events that occur during the execution
 * of programs. When an exception occurs within a method, the method creates an
 * object and hands it off to the runtime system. The object, called an
 * exception object, contains information about the error, including its type
 * and the state of the program when the error occurred. Creating an exception
 * object and handing it to the runtime system is called throwing an exception.
 * 
 * object >>> throwable >>> Exception >>> runtimeException, others(OIException,
 * class exception, SQL exception, checked exception)
 * 
 * 1. ArithmeticException
 * 2. ArrayIndexOutOfBoundsException
 * 3. NullPointerException
 * 4. integral division by zero
 * 5. NumberFormatException
 * 6. RuntimeException
 * 
 * 
 * try { // code that may throw an exception }
 * catch (ExceptionType name) { // code to handle the exception }
 */