//single Dimensional Array

package Arrays;
import java.util.Arrays;

public class Singledimen {
    public static void main(String... args) { // public static void main(String ... args) ... stands for varargs

        // example1
        // creating an array
        int[] numbers = { 38, 46, 23, 1, 2, 5, 10 };

        // sorting
        Arrays.sort(numbers);

        // 'enhanced for loop' to print the 'for' loop already sorted
        for (int x : numbers) {
            System.out.println(x);
        }

        numbers[0] = 34;

        // displays numbers in square brackets using ToString method just display the
        // array as it is
        System.out.println(Arrays.toString(numbers));

        // example 2
        // for searching a particular value in the array using binary searching
        // binary search always search in in an unsorted way, so first we have to sort
        // it, and then search
        // it will compare the values according the letters "A" first and then
        String[] names = { "Viatrix", "Desmond", "Jing", "Kenneth", "Tarn", "Andrea", "Jason", "Lakshantha", "Nabeel",
                "Parvesh", "Chiranjeev", "Ashwin", "Akin", "Wahid", "Alina" };
        System.out.println(names.length);
        Arrays.sort(names);
        // this prints the array sorted
        System.out.println(Arrays.toString(names));

        // this prints the index of the value in the array
        System.out.println(Arrays.binarySearch(names, "Jason")); // 6 is the index in the array

        // if I search for a valuje not in the array displays '-' example:
        System.out.println(Arrays.binarySearch(names, "Arun")); // -4

        // example 3:
        // creating a new array lenght of five empty positions
        double[] numbers1 = new double[5];

        // filling all the array with the same value
        Arrays.fill(numbers1, 23.5);
        System.out.println(Arrays.toString(numbers1)); // prints for default 23.5 in all elements of the array

        // example4:
        // making a copy of the array
        double[] numbers2 = numbers1;
        System.out.println("\nthis is the numbers2 array copied:");
        System.out.println(Arrays.toString(numbers2));

        // example 5: copyOf for copying an array
        // assigning a new value
        // numbers1[5] = 42.5; //it overexceeds the capacity of the array
        numbers1[4] = 42.5;
        System.out.println("\nnumbers1 array after assigning a new value: ");
        System.out.println(Arrays.toString(numbers1)); // now it works well and display new value
        // this numbers 2 is not a copy of the array because it is pointing at the same
        // position of numbers1, so we need to make a copy of the array independently...

        // example 6: for creating a copy of the array,
        double[] numbers3 = Arrays.copyOf(numbers1, numbers1.length); // if I want the same lenght of the previous array
        // changing a value in numbers3
        numbers3[2] = 48.8;
        System.out.println("\nnumbers3 changed: ");
        System.out.println(Arrays.toString(numbers3));

        System.out.println("\nnumbers1 remain unchanged");
        System.out.println(Arrays.toString(numbers1));

        // example 7: changing the lenght of the new array
        double[] numbers4 = Arrays.copyOf(numbers1, 10);
        System.out.println("\nnumbers4 new lenght: ");
        System.out.println(Arrays.toString(numbers4));



    }
}

/*
 * NOTES:
 * for sorting do not required writing a method, instead 'Arrays.sort()'
 * add 'import java.util.Arrays;'
 * 
 * numbers3 = numbers4 >>> in this case, numbers4 will be assigned to numbers3
 * numbers4 = numbers3 >>> in this case, numbers3 will be assigned to numbers4
 */