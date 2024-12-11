import java.util.Scanner;

public class Hello_Java {
    public static void main(String[] args) {
        // header();
        // normalSum();
        // formulas();
        boolish();
        // int resultAdd = add(4, 6); // Call to add method
        // System.out.println("Result of addition: " + resultAdd); // Print result of addition
        // double resultMultiply = multiply(3, 7); // Call to multiply method
        // System.out.println("Result of multiplication: " + resultMultiply); // Print result of multiplication
    }

    public static void header() {
        System.out.println("Hello from VSCODE!");
    }

    public static void normalSum() {
        int num1 = 2;
        int num2 = 4;

        int total = num1 + num2;
        System.out.println("This is an example of simple SUMMATORY: " + total);
    }

    public static void formulas() {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        a = getIntFromUser(input, "Enter your first integer value: ");
        b = getIntFromUser(input, "Enter your second integer value: ");
        c = getIntFromUser(input, "Enter your third integer value: ");

        input.close();

        int total2 = a + b + c;
        System.out.println("The result is: " + total2);
    }

    private static int getIntFromUser(Scanner input, String prompt) {
        int num;
        while (true) {
            try {
                System.out.print(prompt);
                num = input.nextInt();
                break; // Break the loop if input is successful
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine(); // Clear the input buffer
            }
        }
        return num;
    }

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two doubles
    public static double multiply(double x, double y) {
        return x * y;
    }

    public static void boolish() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the name: ");
        String name = scanner.nextLine();

        if (!name.isEmpty()) {
            System.out.println("Those are names!");
        } else {
            System.out.println("Those are not names!!!!");
        }
        scanner.close();
    }
}
