public class Demo {
    public static void main(String[] args) {
        Faculty jaspreet = new Faculty();
        jaspreet.setFirst_name("Jaspreet kaur");

        jaspreet.display();

        // the staff is pointing to an object of the subclass
        Staff staff = new Faculty();

        // compile time binding is going to fail because Staff does not have display
        // defined
        staff.display();

        // the display version of the 'Faculty' or 'subclass' will be displayed
    }
}
