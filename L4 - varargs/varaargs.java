//variables - arguments

/*
   varargs are denoted by...
 * it will be the last parameter of your methd
 * a method cannot have more than one varargs parameter
 */
public class varaargs {
    static void add(int... a) // WE CANNOT HAVE TWO VAARGS ei. (int... a, String b)
                              // varargs has to be the last parameter (double c, int... a)
    {
        // local variable 'sum'
        int sum = 0;
        for (int i = 0; i < a.length; i++) {

            // short hand addition assignment
            sum += a[i]; // or this (sum = sum+a[i]) is the same
        }
        System.out.println("\nthe total of the " + " " + a.length + " " + "numbers: " + sum);
    }

    public static void main(String[] args) {

        // invoking add with 2 parameters
        add(10, 20);

        // invoking add with 3 parameters
        add(10, 20, 30);

        // invoking add with 4 parameters
        add(10, 20, 30, 40);

    }
}
