import java.time.LocalDate;

//the 'final' classes cannot be extended
//if you want to prevent your class from being uinherited, mark it as a 'final'
public class Staff {

    // demographics for staff
    private String first_name;
    private String last_name;
    private String email_address;
    private String phone_number;
    private LocalDate date_of_birth;

    // Defining no-args constructor of the subclass for avoid errors
    // constructor with NO arguments
    public Staff() {
        System.out.println("I am in super class");
    }

    // contructor of the class
    public Staff(String first_name, String last_name, String email_address, String phone_number,
            LocalDate date_of_birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.phone_number = phone_number;
        this.date_of_birth = date_of_birth;
    }

    // getters and setters
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    void display() {
        System.out.println("The first name is:" + first_name);
        System.out.println("The last name is: " + last_name);
        System.out.println("the email is: " + email_address);
        System.out.println("The Phone number is: " + phone_number);
        System.out.println("The date of birth is: " + phone_number);
    }

}

/*
 * NOTES:
 * Inheritance
 * 
 * extends >>> keyword >>> Single inheritance
 * multilevel
 * 
 * method overriding
 * 
 * which methods >>> abstract methods
 * >>> abstract classes
 * 
 * 
 * cannot be overridden
 * 
 * which clasess cannot be executed
 */