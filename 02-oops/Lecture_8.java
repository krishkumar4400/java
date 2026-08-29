/**
 * Interfaces
 */

interface A {
    int age = 21; // static and final
    String area = "meerut";

    void show(); // public abstract

    void config();
}

// if we do not defined both the methods we need to make this class abstract
// abstract class B implements A {

// }

class B implements A {
    public void show() {
        System.out.println("in B show");
        ;
    }

    public void config() {
        System.out.println("in B config");
    }
}

public class Lecture_8 {

    public static void main(String[] args) {
        A objA = new B();
        objA.show();
        objA.config();
        System.out.println(objA.age);
        System.out.println(objA.area);
        System.out.println(B.age);
        System.out.println(B.area);
        System.out.println(A.age);
        System.out.println(A.area);

        // error: cannot assign a value to static final variable
        // A.age = 10;
        // A.area = "delhi";

        B1 objB = new B1();
        objB.show();

        A1 objA1;
        objA1 = new B1();
        objA1.show();
        objA1.config();
        objA1.run();
    }
}

interface A1 {
    int age = 21; // final and static
    String area = "Bhagalpur";

    void show();

    void config();
}

interface X {
    void run();
}

interface Y {
    void run();
}

interface Z {
    void run();
}

// Types
// 1. funnctional interface:
@FunctionalInterface
interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("in A show");
    }
}

class B1 implements A1, X, Y {
    public void show() {
        System.out.println("in B show");
    }

    public void config() {
        System.out.println("in B config");
    }

    public void run() {
        System.out.println("in B run");
    }
}