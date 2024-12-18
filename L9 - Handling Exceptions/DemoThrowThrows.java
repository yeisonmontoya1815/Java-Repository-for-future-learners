package HandlingExceptions;
//throw and throws are the keywords in Java which are used to handle the exception explicitly.
//it is mostly used to throw the USER DEFINED Exceptions
// it is used to re throw the exception
// it can be used to change the message of the exception
// it is used to throw the exception manually
//throws keyword is used in the header and it is used to let the invoking method called know that the method may throw an exception
// and they can handled in a specific way
// and when throws keyboard you might have to handle the exception within the calling method
//you can kick the can of handling the exception to the invoking method

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoThrowThrows {
    public static void main(String[] args) {
        int a = 0;
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter the value of 'a': ");
            a = s.nextInt();

            try {
                if (a < 0)
                    throw new IllegalArgumentException("The value of 'a' cannot be negative.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                throw e;
            }
        }

        catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}