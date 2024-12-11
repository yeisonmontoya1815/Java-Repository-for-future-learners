// This is an Outer class or Enclosing class
// A LocalInner class is declared inside the method of the outer class
public class DemoLocalnnerclass {
    void display() {

        int x = 20;
        final int a;
        a = 15;
        final int b = 30;

        // this is a inner class or Enclosed class
        class Localnnerclass {
            void update() {
                System.out.println(x);
                System.out.println(b);
                System.out.println(a);

            }
        }
        Localnnerclass l = new Localnnerclass();
        l.update();
    }
}

class TestInner {
    public static void main(String[] args) {
        DemoLocalnnerclass d = new DemoLocalnnerclass();
        d.display();
    }
}
