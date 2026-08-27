/**
 * Arrays
 */

class Student {
    public String name;
    public int rollNo;
    public double marks;
}

public class Lecture_16 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3 };
        for (int val : num) {
            System.out.println(val);
        }

        int[] num1 = new int[10];
        num1[0] = 10;
        System.out.println(num1[0]);

        int[][] matrix = new int[2][2];

        for (int arr[] : matrix) {
            for (int val : arr) {
                System.out.println(val);
            }
        }

        double random1 = Math.random(); // returns a double value
        System.out.println(random1);
        double random2 = Math.random() * 100;
        System.out.println(random2);

        // type casting
        int random3 = (int) (Math.random() * 100);
        System.out.println(random3);

        int[][] matrix1 = new int[4][4];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        // jagged array
        int[][] nums = new int[3][]; // jagged
        nums[0] = new int[3];
        nums[1] = new int[6];
        nums[2] = new int[2];

        for(int[] arr : nums) {
            for(int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // three dimentional array
        int[][][] nums3 = new int[10][10][10];

        int arr1[] = new int[6];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // array of object
        Student s1 = new Student();
        s1.name = "krish";
        s1.rollNo = 10;
        s1.marks = 73;

        Student s2 = new Student();
        s2.name = "ankit";
        s2.rollNo = 15;
        s2.marks = 76;

        Student s3 = new Student();
        s3.name = "raj";
        s3.rollNo = 5;
        s3.marks = 94;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(Student s : students) {
            System.out.println(s.name + " : "  + s.rollNo + " : " + s.marks);
        }
    }
}
