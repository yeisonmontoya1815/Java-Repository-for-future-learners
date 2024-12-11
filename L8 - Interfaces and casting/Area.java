public class Area {

    int length;
    int width;

    // this NO args constructor is to avoid errors in Rectangle and Square
    // sub-classes
    Area() {

    }

    Area(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // in this original state
    // static void area(Area o) {
    // if (o instanceof Rectangle) {
    // System.out.println("The area is: " + o.length * o.width);
    // }
    // }

    // casting 'Object o'
    // the dot operator has higher precedence over the
    static void area(Object o) {
        if (o instanceof Rectangle) {
            System.out.println("\nThe area is: " + ((Area) o).length * ((Area) o).width + "\n");
        }
    }

}

class Rectangle extends Area {

}

class Square extends Area {

}

class Test {
    public static void main(String[] args) {
        /*
         * // Rectangle a1 = new Area(); // this is not allowed
         * Area a1 = new Rectangle(); // the declare type is Area, but it is a Rectangle
         * a1.length = 10;
         * a1.width = 20;
         * 
         * // I am trying to access the static method of the Area
         * // Static method is accesed using the class name outside the class
         * Area.area(a1);
         */

        // with 'Object o' example
        Object a1 = new Rectangle();
        ((Rectangle) a1).length = 10;
        ((Rectangle) a1).width = 20;

        // I am trying to access the static method of the Area
        // Static method is accesed using the class name outside the class
        Area.area(a1);
    }
}

/*
 * NOTES:
 * 
 * unchecked and checked exceptions
 * 
 * Inteface is a collection of abstract methods
 * by default they are public, abstract
 * interfaces cannot have constructors
 * interfaces can have 
 */