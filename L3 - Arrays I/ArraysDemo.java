public class ArraysDemo {
    public static void main(String[] args) {

        // creating an Array of four bytes
        float[] nums = { 1, 2, 3, 4 };

        // declaring an Array
        float[] nums1;
        // creating an Array
        nums1 = new float[4];

        System.out.println(nums1[0]);
        System.out.println(nums1[1]);
        System.out.println(nums1[2]);
        System.out.println(nums1[3]);
        // System.out.println(nums1[4]); //this generates compilation error, overexcedes
        // capacity or the array
        System.out.println("I am not executed ever!");

        // another example
        nums[3] = 23.0f;
        System.out.println(nums[3]);

        // another example of creating arrays
        int[] nums2 = { 3, 4, 5, 6 };
        System.out.println(nums2[2]);

        // rounded manually the numbers in the array
        float[] quiz_marks = { 23.5f, 34.67f, 67.4f };
        quiz_marks[0] = Math.round(quiz_marks[0]);
        System.out.println("rounded manually: " + quiz_marks[0]);

        // using 'for'
        float[] quiz_marks1 = { 23.5f, 34.67f, 67.4f };
        for (int i = 0; i < quiz_marks1.length; i++) {
            System.out.println("using for loop: " + i);
            System.out.println("*******************\n");
        }

        //example of passs by reference and can array return 
        change(quiz_marks1);

        // display the updated array
        System.out.println("Displaying the updated array:");
        System.out.println("*******************\n");

        for(int i=0; i<nums.length;i++)
        {   
            System.out.println(quiz_marks1[i]);
        }

    }

    static float[] change(float[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] += 5;
        }
        return nums;
    }
}

/*
 * for loop:
 * step1: int i = 0 'i' is initialized
 * step2: i<nums
 * step3: display 'i'
 * step4: i++
 */