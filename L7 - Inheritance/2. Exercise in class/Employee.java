import java.time.LocalDate;

public class Employee {
    private String employee_name;
    private String employee_number;

    public Employee(String employee_name, String employee_number, LocalDate hire_date) {
        this.employee_name = employee_name;
        this.employee_number = employee_number;
        this.hire_date = hire_date;
    }

    public Employee() {

    }

    private LocalDate hire_date;

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_number() {
        return employee_number;
    }

    public void setEmployee_number(String employee_number) {
        this.employee_number = employee_number;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    void validateEmployeeNumber() {
        int length = employee_number.length();
        if (length != 5) {
            System.out.println("The length is not valid ");
            return;
        } else {
            boolean firstcondition = Character.isDigit(employee_number.charAt(0));
            boolean secondcondition = employee_number.charAt(0) >= 0 && employee_number.charAt(0) <= 9;
            boolean thirdCondition = Character.isDigit(employee_number.charAt(1));
            boolean fourthCondition = employee_number.charAt(1) >= 0 && employee_number.charAt(1) <= 9;
            boolean fifthCondition = Character.isDigit(employee_number.charAt(2));
            boolean sixthCondition = employee_number.charAt(2) >= 0 && employee_number.charAt(2) <= 9;
            boolean seventhCondition = employee_number.charAt(3) == '-';
            boolean eigthCondition = Character.isLetter(employee_number.charAt(4));
            boolean ninthCondition = employee_number.charAt(4) == 'A' || employee_number.charAt(4) == 'B';
            if (firstcondition && secondcondition) {

            }

        }
    }

}