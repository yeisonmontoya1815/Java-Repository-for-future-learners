public class TestMethods {
    final static int a =20;
    final static int b= 30;


    static void display(){
        System.out.println("Displaying 'a': " + a);
        System.out.println("Displaying 'b': " + b);
    }

    //only changing the signature parameters (String s) will be possible to overload the method
    static void display(String s){
        System.out.println("you cannot: " + s + " ok");

    }

    //return is mandatory in this method, otherwise doesnot work!
    //if it were 'float' should be 0.0
    int add(){
        return 0; //'0' because the method returns 'int'
    }

    
    public static void main(String[] args) {

        //for accesing non-static method Ihave to create an object
        TestMethods d = new TestMethods();
        d.display("Hello");
        System.out.println(d.add());
    }
}



/*
 *NOTES for the quiz:

 * to execute 'java'
 * to compile 'javac'
 * 
 * if can be followed without 'else'
 * 
 * switch case, without break all the cases will be executed
 * 
 * ternary operator
 * 
 * == relational operators
 * 
 * equal,  equalsIgnoreCase
 */