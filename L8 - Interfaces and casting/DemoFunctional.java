public class DemoFunctional {
    // anonymous inner class is a class which is defined insigth the moethod of the
    // outer class

    // A class which has a name and is defined inside the methos of a class is known
    // as Local inner class
    public static void main(String[] args) {
        Turner t = new Turner() {
            public void turn() {
                System.out.println("\nTurning\n");
            }
        }; 
        t.turn();
    }
}
