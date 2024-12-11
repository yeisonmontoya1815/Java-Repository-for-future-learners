public class Customer {
    // two class variables
    final static double PRICE_OF_THE_BOOK = 14.99;
    final static double TAX = 0.08;
    // four instance variables
    private int no_of_books;
    private double total_due;
    private String fname;
    private String lname;

    // no-arg constructor
    Customer() {
        fname = "John";
        lname = "Doe";
        no_of_books = 0;
    }

    // parametrized constructor
    Customer(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;

    }

    //getters and setters:

    //defining the getters
    public String getFname(){
        return fname;
    }

    public String getLname(){
        return lname;
    }

    public int getno_of_books(){
        return no_of_books;
    }

    public double getTotalDue(){
        return total_due;
    }

// Setters:

// Defining the setters
public void setFname(String fname){
    this.fname = fname;
}

public void setLname(String lname){
    this.lname = lname;
}

    double computeBilling() {
        System.out.println("Enter the number of books");
        no_of_books = new java.util.Scanner(System.in).nextInt();

        switch (no_of_books) {

            case 1:

                total_due = PRICE_OF_THE_BOOK * (1 + TAX);
                break;

            case 2:
                total_due = PRICE_OF_THE_BOOK * no_of_books + PRICE_OF_THE_BOOK * no_of_books * TAX;
                break;

            case 3, 4, 5:
                System.out.println("Do you have a coupon\n" + "Enter the coupon value");
                double coupon_value = new java.util.Scanner(System.in).nextDouble();
                double subtotal = PRICE_OF_THE_BOOK * no_of_books - coupon_value;
                total_due = subtotal * (1 + TAX);
                break;
            default:
                System.out.println("Enter valid no of books");

        }

        return total_due;

    }

}