import java.util.Scanner;
import java.util.InputMismatchException;

class Circle {
    int radius;
    int perimeter;
    int area;

    public void setRadius(int radius) throws RuntimeException, InvalidRadiusExpection {
        if (radius == 0) {
            throw new IllegalArgumentException("Radius cannot be zero\n");
        }

        if (radius < 0) {
            throw new InvalidRadiusExpection("Radius cannot be negative");
        } else {
            this.radius = radius;
        }
    }

    public static void main(String[] args) {
        try {

            new Circle().setRadius(-5);
            Circle c = new Circle();
        }

        catch (IllegalArgumentException mistake) {
            System.out.println(mistake.getMessage());
        }

        catch (InvalidRadiusExpection mistake) {
            System.out.println(mistake.getMessage());
        }
    }
}
