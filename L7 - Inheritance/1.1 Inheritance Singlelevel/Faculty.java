//'Faculty' class is a subclass
//'Staff' is a Super class

import java.time.LocalDate;

public class Faculty extends Staff {

    // these two members only belong to the Faculty class
    // they are not accessible to Staff
    String department;
    String faculty_type;

    // whenever the default constructor of the subclass is invoked the default
    // constructor of the superclass is invoked implicitly
    public Faculty() {

        System.out.println("I am in a sub-class");
    }

    // parametrized constructor of the 'Faculty' subclass
    public Faculty(String fname, String lname, String email, String phoneno, LocalDate dob, String dept, String ftype) {
        // the only way to invoke the superclass constructor
        // using the super keyword
        // the call to super has to be the first statement
        super(fname, lname, email, phoneno, dob);
        faculty_type = ftype;
        department = dept;
    }

    // method overriding: is ONLY for giving a new body of the 'void display' method
    // in the super class
    /*
     * DO NOT CHANGE THE HEADER
     * DO NOT CHANGE THE SIGNATURE
     * DO NOT ASSIGN A WEAKER ACCES TO A OVERRIDEN METHOD (levels of methods from
     * less than highest privacy: public, protected, default, private)
     * Static, Private and Final methods cannot be overriden!
     */
    void display() {
        // super.display();
        System.out.println("The department is: " + department + "I am the method of sub class");
    }

    public static void main(String[] args) {
        // create an object of the subclass using no-arg constructor
        Faculty jaspreet = new Faculty();
        jaspreet.setFirst_name("Jaspreet kaur");
        System.out.println(jaspreet.getFirst_name());
    }
}

/*
 * NOTES:
 * extends
 * 
 * levels of methods from less than highest privacy
 * public
 * protected
 * default
 * private
 * 
 */
