import java.util.Scanner;

public class ProgramWithExceptions {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);   
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("Enter the value of a: " + a);
        a = s.nextInt();
        System.out.println("Enter the value of b: " + b);
        b = s.nextInt();

        int sum = a + b;
        int quotient = a / b;

        System.out.println("the sum of the two numbers is: " + sum);
        System.out.println("the quotient of the two numbers is: " + quotient);
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
 */