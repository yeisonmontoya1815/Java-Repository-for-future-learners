import java.util.Scanner;

public class TestCustomer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first name: \n");
        String first_name = s.nextLine();
        
        System.out.println("enter the last name: \n");
        String last_name = s.nextLine();

        Customer cust1 = new Customer(first_name, last_name);
    
        cust1.computeBilling();
        
        display(cust1);

    }
    static void display(Customer c){
        System.out.println("Displaying customer now: ");
        System.out.println("the first name of the customer is: " + c.getFname());
        System.out.println("the last name of the customer is: " + c.getLname());
        System.out.println("the number of books bought: " + c.getno_of_books());
        System.out.println("the way to format values up to two digits are: " + String.format("%.2f",c.getTotalDue())); // for formatting values
        System.out.println("the total is: " + "$" + c.getTotalDue() + " CAN");
    
}
}


/*NOTES:
getters and setters are for accesing to a private variables
 * getters:
 * always are public
 * match the return type of the variable
 * 
 * public String get Fname()
 * 
 * 
 * setters:
 * public void setFname(String fname)
 * 
 */