// What is an Interface?

// An Inteface is a collection of (public and abstract) methods
// by default they are <public static final>
// Interface is created using the keyboard 'Interface'
// a interface cannot have be instantiated
// but you can create reference variables
// A class which implements an interface has ot override all
// From JAVA 8: there can be methods which can body: default methods and static methods
// From JAVA 9: interfaces can have private methods as well
// An Interface can extend another Interface
// A classs first extends and then implements the multiple Interfaces

// Example >>> Class C{}   Interface A {}    Interface B {}
//therefore >>> Class D extends C implements A,B

//interface
public interface Turner {
    void turn(); // by default this method is public and abstract. That is why I dont have to
                 // write public

    String name_of_the_store = "Java in Baby steps"; // by default is public, static and final

    // add it as 'default void display' method
    // always has to be body in all interface methods 'sout...'
    default void display() {
        System.out.println("I am displaying");
    }

    static void details() {
        System.out.println(name_of_the_store);
    }
}

/*
 * NOTES:
 * 
 * can the default methods of the interface be overriden in the classes
 * implemented?
 * Yes it can be overriden
 * 
 * by default methods in interfaces are: (public, static and final)
 */
