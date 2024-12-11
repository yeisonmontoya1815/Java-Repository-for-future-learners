import java.util.ArrayList;
import java.util.Scanner;

public class stringmethods {
    public static void main(String[] args) {
        // Creating a new String
        String name1 = new String("Jaspreet Kaur Sahiwal");

        // Length of the String
        System.out.println("Length of the String: " + name1.length());

        // indexOf() returns the position of the character
        System.out.println("Position of the first space in the String: " + name1.indexOf(" "));

        // lastIndexOf() returns the last position of the occurrence
        System.out.println("Last occurrence of space in the String: " + name1.lastIndexOf(" "));

        // If the character is not present, it returns -1
        System.out.println("Example of character 'o' not being present: " + name1.lastIndexOf('o'));

        // Extract the last name from the String using substring(int startIndex, int
        // endIndex)
        System.out.println("Last name with space: \n" + name1.substring(name1.lastIndexOf(" ")));

        // +1 to exclude the space
        System.out.println("Last name without space (+1): \n" + name1.substring(name1.lastIndexOf(" ") + 1));

        // Example of extracting specific values from a list of courses
        String[] coursesBeingOffered = {
                "ACCT2320", "ACCT3008", "BIOL1100", "BIOL1103", "BUSN1210", "BUSN2429",
                "CSIS2175", "CSIS1175", "CSIS2260", "CSIS2270"
        };

        // Scanner for user input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the choice to filter courses: ");
        String choice = s.nextLine();
        choice = choice.toUpperCase(); // This allows for case insensitive input

        // Create a list for filtered courses
        ArrayList<String> filteredCourses = new ArrayList<>();

        // Filter courses that start with the input choice
        for (String course : coursesBeingOffered) {
            if (course.startsWith(choice)) {
                System.out.println(course);
                filteredCourses.add(course);
            }
        }

        // Convert names to lowercase
        String[] theNames = { "eDuardo", "omAr daniel" };
        for (String name : theNames) {
            System.out.println("Names in lowercase: " + name.toLowerCase());
        }

        // Example of creating an email address
        String domain = "@student.douglascollege.ca";
        System.out.println("Courses filtered by the student: " + filteredCourses);
        String names = "Eduardo Valenzuela Guerrero";
        String lastName1 = names.substring(names.lastIndexOf(" ")).trim();
        String firstNameInitial = names.substring(0, 1);
        System.out.println("The email is: " + lastName1.concat(firstNameInitial).concat(domain).toLowerCase());

        // Close the scanner
        s.close();
    }
}
