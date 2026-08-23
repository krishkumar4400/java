/**
 * Arrays
 */

public class Lecture_08 {
    public static void main(String[] args) {
        int[] arr;
        // Declaration
        int[] marks1;         // preferred style
        int marks2[];         // also valid (C-style, avoid)

        // Declaration + Initialization
        int[] marks3 = new int[5];          // 5 elements, all initialized to 0
        String[] names = new String[3];    // 3 elements, all initialized to null

        // Declaration + Initialization + Values
        int[] scores1 = {90, 85, 78, 92, 88};       // shorthand (only at declaration)
        int[] scores2 = new int[]{90, 85, 78};      // explicit form (usable anywhere)

        int[] marks = { 85, 90, 78, 92, 88 };

        // Access by index (0-based)
        System.out.println(marks[0]); // 85 (first element)
        System.out.println(marks[4]); // 88 (last element)

        // Length
        System.out.println(marks.length); // 5 (note: no parentheses — it's a field, not method)

        // Modify
        marks[2] = 95;
        System.out.println(marks[2]); // 95

        // Traverse with for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        // Enhanced for-each loop (cleaner for read-only traversal)
        for (int mark : marks) {
            System.out.print(mark + " "); // 85 90 95 92 88
        }

        // Arrays as Objects (Heap)
        int[] arr1 = new int[3];
        // 'arr' is a reference variable on the STACK
        // The actual array {0, 0, 0} is an object on the HEAP
        // arr points to that object

        int[] arr2 = arr1; // arr2 points to the SAME array!
        arr2[0] = 99;
        System.out.println(arr1[0]); // 99 ← arr is affected too!

        // This is reference semantics — a critical concept. When you assign an array to another variable, you copy the reference, not the array.

        // 2D Arrays
        int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

System.out.println(matrix[1][2]); // 6 (row 1, col 2)

// Traverse 2D array
for (int i = 0; i < matrix.length; i++) {          // rows
    for (int j = 0; j < matrix[i].length; j++) {   // columns
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

// Common Mistakes
// 1. ArrayIndexOutOfBoundsException
int[] arr = new int[5];
arr[5] = 10; // ❌ Error! Valid indices: 0-4

// 2. Forgetting that length is a field, not method
arr.length();  // ❌ Error
arr.length;    // ✅ Correct

// 3. Null reference
int[] arr2;
arr2[0] = 5;   // ❌ NullPointerException — not initialized!

// 4. Printing array directly
int[] nums = {1,2,3};
System.out.println(nums);   // ❌ Prints something like [I@6d06d69c
System.out.println(java.util.Arrays.toString(nums)); // ✅ [1, 2, 3]


// Arrays Utility Class
import java.util.Arrays;

int[] nums = {5, 3, 1, 4, 2};
Arrays.sort(nums);                          // Sort in place: [1, 2, 3, 4, 5]
System.out.println(Arrays.toString(nums));  // [1, 2, 3, 4, 5]
int idx = Arrays.binarySearch(nums, 3);    // 2 (index of 3 after sorting)
int[] copy = Arrays.copyOf(nums, nums.length); // Deep copy

    }
}
