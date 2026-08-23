/**
 * this keyword
 */

class Student {
    private String name;// instance variable
    private int age;

    public Student(String name, int age) {
        this.name = name; // Without this: 'name' would refer to the parameter, not the field
        this.age = age;// 'this.name' = instance variable, 'name' = parameter
    }

    public void printInfo() {
        // 'this' refers to whichever object called printInfo()
        System.out.println(this.name + " is " + this.age + " years old");
    }
}

public class Lecture_12 {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 21);
        Student s2 = new Student("Carol", 20);

        s1.printInfo(); // 'this' = s1 → "Bob is 20 years old"
        s2.printInfo(); //'this' = s2 → "Carol is 22 years old"
    }
}