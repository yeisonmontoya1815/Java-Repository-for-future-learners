
// They will be accessed directly
// Access them using the name of the class if outside the class
class BookBilling {
    static final double PRICE_OF_THE_BOOK = 14.99;
    static final double TAX = 0.08;

    // Computes the total bill for one book
    static double ComputeBill() {
        double total_due = PRICE_OF_THE_BOOK * (1 + TAX);
        return total_due;
    }

    // Computes the total bill for multiple books (one argument)
    static double ComputeBill(int quantity) {
        double total_due = 0;
        double subtotal = PRICE_OF_THE_BOOK * quantity;
        total_due = subtotal + (subtotal * TAX);
        return total_due;
    }

    // Computes the total bill for multiple books with a coupon (two arguments)
    public static double ComputeBill(int quantity, double coupon) {
        double total_due = 0;
        double subtotal = PRICE_OF_THE_BOOK * quantity - coupon;
        total_due = subtotal + subtotal * TAX;
        return total_due;
    }

    // Overloading method example
    public static void main(String[] args) {
        int quantity = 2;
        int coupon_value = 23;

        System.out.println("The total when a customer buys only one book: " + ComputeBill());
        System.out.println(
                "The total when a customer buys more than one book without a coupon: " + ComputeBill(quantity));
        System.out.println("The total when a customer buys more than one book with a coupon: "
                + ComputeBill(quantity, coupon_value));
    }
}

/*
 * NOTES:
 * /*
 * Access-specifier:
 * >>> public (Highest visibility - accessible from any other class)
 * >>> protected (Second highest visibility - accessible within the same package
 * and by subclasses)
 * >>> default (package-private - accessible only within the same package; if no
 * access specifier is specified, this is the default)
 * >>> private (Lowest visibility - accessible only within the same class)
 * 
 * >>> static (I don't need an object to call, belongs to the class)
 * >>> non-static (I need an object, belongs to instances of the class)
 * 
 * Return type:
 * >>> void (when it does not return anything)
 * >>> int, double, float... (return the specific value of the return type)
 * 
 * Name of the method:
 * >>> name and mandatory brackets, e.g., method(){}
 * 
 * Arguments of the method:
 * >>> are optional and inside the method, e.g., method(x, y)
 * 
 * Method overloading:
 * >>> the same name but different signature.
 * >>> e.g., ComputeBill() >>> NO arguments
 * >>> ComputeBill(int numBooks) >>> one argument
 * >>> ComputeBill(int numBooks, int discount) >>> two arguments but superseded
 * by the following one.
 * >>> ComputeBill(int numBooks, double discount) >>> this is more complete
 * (double discount) than the previous one.
 * 
 * Example class:
 * class Student {
 * String first_name;
 * String last_name;
 * float CGPA;
 * 
 * final static int CGPA_Converter = 9;
 * }
 * 
 */
