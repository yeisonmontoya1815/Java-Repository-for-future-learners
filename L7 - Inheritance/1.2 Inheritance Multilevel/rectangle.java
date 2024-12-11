
// A class which has atleast one method as abstract is known as abstract class 

// It can still have complete methods 

// You cannot instantiate an abstract class 

// But the reference variables of an abstract class can exist 

// It can have constructors 

// It have  members 

// If any concrete class extends an abstract class , it has to overrride 
//all its abstract methods 

abstract class Shape {
    int length;
    int width;

    Shape() {

    }

    Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

     abstract protected void area(); 

    abstract protected void perimeter();

    //
    void display() {
        System.out.println("The len is " + length);
        System.out.println("The width is " + width);
    }
}

class Rectangle extends Shape {

    public void area() {
        System.out.println("The area is " + length * width);
    }

    public void perimeter() {
        System.out.println(2 * (length + width));
    }

}

class Circle extends Shape {

    int radius;

    Circle() {
        length = 0;
        width = 0;
    }

    Circle( int r) {
        this();
        radius = r;
    }

    public void area() {
        System.out.println(Math.PI * radius * radius);
    }

    public void perimeter() {
        System.out.println(2 * Math.PI * radius);
    }
}