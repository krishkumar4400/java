
/**
 * Comparators
 */

import java.util.*;

/**
 * public class Lecture_16_comparators {
 * public static void main(String[] args) {
 * List<Integer> nums = new ArrayList<>();
 * nums.add(4);
 * nums.add(3);
 * nums.add(9);
 * nums.add(7);
 * 
 * Collections.sort(nums);
 * 
 * System.out.println(nums);
 * }
 * }
 * 
 */

// sort values on custom logic - eg: by last digit
// public class Lecture_16_comparators {
// public static void main(String[] args) {
// List<Integer> nums = new ArrayList<>();
// nums.add(43);
// nums.add(36);
// nums.add(94);
// nums.add(71);

// List<String> str = new ArrayList<>();
// str.add("krish");
// str.add("ankit");
// str.add("raj");
// str.add("aman");
// str.add("krishna");

// System.out.println(nums); // [43, 36, 71, 94]
// System.out.println(str); // [krish, ankit, raj, aman, krishna]

// Comparator<Integer> comparator1 = new Comparator<Integer>() {
// public int compare(Integer i, Integer j) {
// if (i % 10 > j % 10) {
// return 1;
// }
// return -1;
// }
// };

// Collections.sort(nums, comparator1);
// System.out.println(nums);

// Comparator<Integer> comparator2 = new Comparator<Integer>() {
// public int compare(Integer i, Integer j) {
// if (i < j) {
// return 1;
// }
// return -1;
// }
// };

// Collections.sort(nums, comparator2);
// System.out.println(nums);

// Comparator<String> comparator3 = new Comparator<String>() {
// public int compare(String s1, String s2) {
// if (s1.length() > s2.length()) {
// return 1;
// }
// return -1;
// }
// };
// Collections.sort(str, comparator3);
// System.out.println(str); // [raj, aman, ankit, krish, krishna]

// }
// }

// class Student {
// int age;
// String name;

// Student(int age, String name) {
// this.age = age;
// this.name = name;
// }

// @Override
// public String toString() {
// return "Student [age=" + age + ", name=" + name + "]";
// }

// public void show() {
// }
// }

// public class Lecture_16_comparators {
// public static void main(String[] args) {
// List<Student> student = new ArrayList<>();
// student.add(new Student(20, "krish"));
// student.add(new Student(18, "ankit"));
// student.add(new Student(42, "amit"));
// student.add(new Student(26, "rahul"));
// student.add(new Student(13, "ayush"));

// Comparator<Student> comparator = new Comparator<>() {
// public int compare(Student s1, Student s2) {
// if (s1.age > s2.age) {
// return 1;
// }
// return -1;
// }
// };

// System.out.println("Before Sorting");
// for (Student s : student) {
// System.out.println(s.name + " : " + s.age);
// }
// Collections.sort(student, comparator);
// System.out.println("After Sorting");
// for (Student s : student) {
// System.out.println(s.name + " : " + s.age);
// }

// System.out.println(student.toString());
// }
// }

class Student implements Comparable<Student> {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        }
        return -1;
    }
}

public class Lecture_16_comparators {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(20, "krish"));
        student.add(new Student(18, "ankit"));
        student.add(new Student(42, "amit"));
        student.add(new Student(26, "rahul"));
        student.add(new Student(13, "ayush"));

        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;
        System.out.println(student);
        Collections.sort(student, com);
        System.out.println(student);

        for (Student stud : student) {
            System.out.println(stud.name + " : " + stud.age);
        }
    }
}