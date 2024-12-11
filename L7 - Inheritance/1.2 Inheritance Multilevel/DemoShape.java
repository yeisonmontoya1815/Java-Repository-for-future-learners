import java.util.Scanner;

public class DemoShape {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 for Rectangle\n" + " " + "Enter 2 for a Circle");

        int choice = s.nextInt();
        // reference variable of the type Shape
        Shape geometricobject = null;

        switch (choice) {

            case 1:
                geometricobject = new Rectangle();
                geometricobject.length = 20;
                geometricobject.width = 30;
                geometricobject.area();
                geometricobject.perimeter();
                break;

            case 2:
                geometricobject = new Circle(23);
                geometricobject.area();
                geometricobject.perimeter();
                break;
            default:
                System.out.println("Invalid choice ");

        }
    }
}