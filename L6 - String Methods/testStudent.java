import java.util.*;

public class testStudent {

    public static void main(String[] args) {
        // creating an ArrayList of Students
        Scanner s = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        System.out.println("Enter the number of students you want to add initially");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            Student stu = createStudent();
            students.add(stu);
        }
        System.out.println("Enter the choice for sorting >>> 1 for name 2 for age 3 for roll no");
        int choice = s.nextInt();
        switch (choice) {

            case 1:
                Collections.sort(students, new NameComparator().reversed());  //adding .reversed sort them in descendig order
                break;

            case 2:
                Collections.sort(students, new AgeComparator().reversed());
                break;

            case 3:
                Collections.sort(students, new RollNoComparator().reversed());
                break;

            default:

                System.out.println("Not a valid choice");
                break;

        }

        Iterator itr = students.iterator();

        while (itr.hasNext())

        {
            System.out.println((Student) itr.next());
        }
    }

    static Student createStudent() {
        Scanner s = new Scanner(System.in);
        // reference variable of the type student
        Student stu;

        System.out.println("Enter the name of the student");
        String name = s.nextLine();
        System.out.println("Enter the age of the student");
        int age = s.nextInt();
        System.out.println("Enter the roll_no of the student");
        int roll_no = s.nextInt();
        stu = new Student(name, age, roll_no);
        return stu;
    }
}