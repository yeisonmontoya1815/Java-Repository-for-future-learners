import java.util.Scanner;

public class nestedTry {
    public static void main(String[] args) {

        // global variables
        int sum = 0;
        int quotient = 0;

        // Example of Exception Handling
        try {
            Scanner s = new Scanner(System.in);

            // creating an array of integers
            int[] nums = { 1, 2, 3, 4 };

            System.out.println("Enter the value of a: ");
            int a = s.nextInt();

            System.out.println("Enter the value of b: ");
            int b = s.nextInt();

            //inner try block
            try {

                sum = a + b;
                quotient = a / b; // May cause ArithmeticException if b is zero

                for (int i = 0; i <= nums.length; i++) {
                    System.out.println(nums[i]);
                }
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finally inner block executed.");
                System.out.println("I am always executed.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally outer block executed.");
            System.out.println("I am always executed.");
        }
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The quotient of the two numbers is: " + quotient);
    }
}

/*
 * NOTES:
 * nested try block is a try block inside another try block
 * userdefined exceptions are not checked exceptions, those are provided by the
 * programmer
 * 
 * 
 * 
 * 
 */