class first {
    int a = 20;
    int b = 30;

    void add() {
        System.out.println(a + b);
    }
}

class Second extends first {
    int c = 40;

    void display() {
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        System.out.println("The value of c is: " + c);
    }

}

class Third extends Second {
    public static void main(String[] args) {
        int d = 60;

        Third t = new Third();
        t.add(); // inherits from 'first' class
        t.display(); // inherits from 'second' class

        // inherits from a, b and c classes
        t.a = 35;
        t.b = 45;
        t.c = 45;

        first f = new first();
        System.out.println(f.a);
        System.out.println(f.b);
        System.out.println(new Second().a);
        System.out.println(new Second().b);
        System.out.println(new Second().c);
        // System.out.println(new Second().d);  // error!
        System.out.println(d); // 'd' is exclusively for 'Third' class

    }
}




/*NOTES:
 *  'abstract' method is a method with a body
 * 
 */