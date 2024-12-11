import java.util.Scanner;

public class DemoTurners {
    public static void main(String[] args) {
        // You can declare reference variables of Interfaces but cannot instantiate them
        Turner t;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the choice: >> 1 for Leaf\n >> 2 for Page \n + >> 3 for Pancake");
        int choice = s.nextInt();

        switch (choice) {

            case 1:

                t = new Page();
                t.turn();
                break;

            case 2:
                t = new Leaf();
                t.turn();
                t.display();
                break;

            case 3:
                t = new Pancake();
                t.turn();
                break;

            default:
                System.out.println("Invalid choice ");
                break;

        }

        Leaf f = new Leaf();

        f.display();

        s.close();
    }

}