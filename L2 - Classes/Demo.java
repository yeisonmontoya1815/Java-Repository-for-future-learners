public class Demo {
    public static void main(String[] args) {

        System.out.println("Type Casting: \n");
        typeCasting();
        System.out.println("**********************\n");

        System.out.println("Comparisons: \n");
        Comparison();
        System.out.println("**********************\n");

        System.out.println("Constructors: \n");
        constructors();
        System.out.println("**********************\n");

        System.out.println("Post Increment Examples: \n");
        postIncrement();
        System.out.println("**********************\n");

        System.out.println("Pre Increment Examples: \n");
        preIncrement();
        System.out.println("**********************\n");

        System.out.println("Post Decrement Examples: \n");
        postDecrement();
        System.out.println("**********************\n");

        System.out.println("Pre Decrement Examples: \n");
        preDecrement();
        System.out.println("**********************\n");

        System.out.println("The final variable: \n");
        TheFinal();
        System.out.println("**********************\n");

        System.out.println("Concatenation example: \n");
        concatenation();
        System.out.println("**********************\n");

    }

    // Demonstrates type casting and Integer class usage
    public static void typeCasting() {
        // Implicit type casting example
        float f = 3; // is by default assigned as 3.0
        System.out.println(f);

        // Explicit type casting example
        float b = (int) 2.3; // narrows the data type to a integer = 2.0
        System.out.println("narrows the data type to a integer = " + b);

        // Using the Integer class
        Integer a = 10; // it does exist!
        System.out.println(a); // 10

        float T = 5f;
        System.out.println(T); // 5.0
    }

    // Compares strings using equals, equalsIgnoreCase, and compareToIgnoreCase
    // methods
    public static void Comparison() {
        String name = "Jhon";
        String name1 = "Jhon";
        String name2 = "maria";
        String name3 = "MARIA";
        String name4 = "mariaaa";
        String name5 = "mariaa";

        System.out.println("'equals' compare exactly (Jhon-Jhon): " + name.equals(name1)); // returns true if names are
                                                                                           // equal
        System.out
                .println(
                        "'equalsIgnoreCase' ingnores case sensitive (maria - MARIA): " + name2.equalsIgnoreCase(name3)); // ignores
                                                                                                                         // case

        // 0 si las dos cadenas son iguales ignorando dif de may y min.
        // -1 si la primera es menor que la segunda ignorando dif de may y min.
        // 1 si la primera es mayor que la segunda ignorando dif de may y min.
        System.out.println("'compareToIgnore': " + name4.compareToIgnoreCase(name5));

        // Comparison using ==
        if (name == name1) {
            String last_name = "Smith";
            name = name + "" + last_name;
            System.out.println("We are pointing to the same location");
        } else {
            System.out.println("We are pointing to different locations");
            System.out.println("My updated name is: " /* + last_name */);
        }

    }

    // Demonstrates string comparison with new String()
    public static void constructors() {
        String name = "Jhon";
        String name1 = new String("Jhon");

        // Comparison with '=='
        if (name == name1)
            System.out.println("We are pointing to the same ");
        else
            System.out.println("We are pointing to different locations");
        System.out.println("-------");

        if (name.equals(name1)) {
            System.out.println("Yes, These Jhon's are in the same location");
        } else {
            System.out.println("No, These Jhon's are NOT in the same location");
        }
        System.out.println("-------");

        // Demonstrates string comparison using equalsIgnoreCase()
        // compares strings, NOT locations, so these are equal
        String name2 = "Brad";
        String name3 = new String("Brad");

        if (name2.equalsIgnoreCase(name3)) {
            System.out.println("This Jhon is in the same location");
        } else {
            System.out.println("This Jhon is NOT in the same location");
        }
        System.out.println("-------");

    }

    // Demonstrates increment and decrement operators
    public static void postIncrement() {
        int a = 22;
        a *= 3;
        int b = a;

        // a++ post-increment
        System.out.println("a++ " + a++); // result: 66
        System.out.println("la nueva 'a': " + a); // result: 67
        System.out.println("b: " + b); // result: 66

        // Using post-increment in a print statement
        System.out.println("Result: " + a++);
        System.out.println("Result: " + a++);
        System.out.println("Result: " + a++);
        System.out.println("Result: " + a++);
        System.out.println("Result: " + a++);

    }

    public static void preIncrement() {
        int a = 22;
        System.out.println("'a' Original: " + a); // a = 22
        System.out.println("'a' with pre increment: " + ++a); // a = 23
        a += 1;
        System.out.println("'a' with preincrement + 1: " + a); // a = 24
    }

    // Demonstrates increment and decrement operators
    public static void postDecrement() {
        int a = 15;
        a *= 2;
        int b = a;

        // a-- post-decrement
        System.out.println("a-- " + a--); // result: 30
        System.out.println("la nueva 'a': " + a); // result: 29
        System.out.println("b: " + b); // result: 30

        // Using post-decrement in a print statement
        System.out.println("Result: " + a--); // 29
        System.out.println("Result: " + a--); // 28
        System.out.println("Result: " + a--); // 27

    }

    public static void preDecrement() {

        int a = 22;

        System.out.println("'a' Original: " + a); // a = 22
        System.out.println("'a' with pre decrement: " + --a); // a = 21

        a -= 1; // a = 20

        System.out.println("'a' with predecrement - 1: " + a); // a = 20
    }

    // Demonstrates the final keyword
    public static void TheFinal() {
        final int status;
        status = 10;

        // status += 2;
        // by activating the above line of code, it will cause a compilation error
        // because 'final' variables must be assigned only once and cannot be modified
        // thereafter
    }

    // concatenates an integer when is next to String
    public static void concatenation() {
        System.out.println("Result concatenating strings: " + "5" + 3 + 4);
        System.out.println("Result concatenating strings and sum integers: " + 5 + 2 + (3 + 4));
        System.out.println("Result sum only integers: " + (5 + 3 + 4));
        System.out.println(5 + 2 + (3 + 4));

        System.out.println("Result multiplication integers: " + 3 * 5);
        System.out.println("Result multiplication: " + "('6' * 5) it generates error!");
        System.out.println("Result multiplication parsing Integer: " + (3 * Integer.parseInt("5")));
    }
}

/*
 * NOTES:
 * 
 * JAVA is Case Sensitive language.
 * By default in Java, every value is a 'double'.
 * In operations, the right-hand side is evaluated first.
 * 
 * Implicit type casting example:
 * float a = 3; // is by default assigned as 3.0
 * 
 * Explicit type casting narrows the data type:
 * int b = (int) 2.3;
 * 
 * Arithmetic Operators:
 * (+) addition or concatenation
 * (-) subtraction
 * (*) multiplication
 * (/) division
 * (%) modulus
 * 
 * Relational or Comparison Operators:
 * (<) less than
 * (>) greater than
 * (<=) less than or equal to
 * (>=) greater than or equal to
 * (!=) not equal to
 * (==) equal to
 * 
 * Logical Operators:
 * AND (&&) - logical product operator
 * OR (||) - logical sum operator
 * NOT (!) - logical negation operator
 * 
 * Increment and Decrement Operators:
 * a++ post-increment
 * ++a pre-increment
 * a-- post-decrement
 * --a pre-decrement
 * 
 * Short Hand Assignments:
 * int a = 20;
 * a += 30; // equivalent to a = a + 30;
 * 
 * Quiz Examples:
 * a = a + "8"; // compilation error
 * 
 * 5 != 6 // true
 * 
 * int num = 12;
 * num *= 2;
 * num--; // decrement by 1
 * 
 * Best way to compare if two strings are equal is using .equals()
 * NEVER compare two strings using (==) this is for comparin locations in memory
 * 
 * int status = 7 < 8; // this would cause a compilation error; use boolean
 * 
 * System.out.println(8 == 8); // true
 * 
 * 'final' keyword means the variable's value cannot be changed once
 * initialized.
 * 
 * "It's" + 5 + "pm" // results in "It's 5pm"
 * 
 * More questions at: www.codecademy.com
 */
