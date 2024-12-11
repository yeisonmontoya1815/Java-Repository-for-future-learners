import java.util.ArrayList;
import java.util.*;

public class UserDefined {
    public static void main(String[] args) {
        ArrayList<Double> nums1 = new ArrayList<Double>();
        nums1.add(23.0); // if it were "int 23" doesnot work!

        // printing values
        System.out.println(nums1);
        System.out.println(nums1.size());

        // another Arraylist
        ArrayList<Double> nums2 = new ArrayList<Double>();
        nums2.add(20.5);
        nums2.add(103.5);
        nums2.add(3.5);
        nums2.add(13.5);
        nums2.add(33.5);

        // add an arraylsit nums2 to nums1
        nums1.addAll(nums2);

        // now nums1 appended nums2 so it changes to size 6
        System.out.println(nums1);
        System.out.println(nums1.size());

        // remove(objetct) is an overloaded method
        nums1.remove(43.5); // it removes the value 43.5, and modify the size, decres the size
        System.out.println(nums1);
        System.out.println(nums1.size());

        // remove(index) is an overloaded method
        nums1.remove(2); // it removes the index 2
        System.out.println("index 2 removed : " + nums1);
        System.out.println("new index: " + nums1.size());

        // removing all the elements of the array
        // the result is '0' no elements in the array
        // nums1.clear();
        System.out.println(nums1);
        System.out.println(nums1.size());

        // accesing of all elements of the array list
        // for loop to access the elements
        for (double x : nums1) {
            System.out.println("foreach access element: " + x);
        }

        // using for
        for (int i = 0; i < nums1.size(); i++) {

            // System.out.println(x); this alone does not work, instead!
            double new_value = nums1.get(i);
            new_value += 5;
            nums1.set(i, new_value);
        }
        System.out.println("For by adding 5 to each value: " + nums1);

        // Collections.sort(nums1).reversed IS NOT VALID;
        // if I want to sort the elements in ascending order, first uncomment next
        // codeline
        // Collections.sort(nums1);
        // using an iterator
        // for much optimize the structure of the access of elements of the array
        Iterator itr = nums1.iterator();

        while (itr.hasNext()) {
            System.out.println("Iterator: " + itr.next());
        }

    }

}