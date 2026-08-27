
/**
 * Type Casting
 */

public class Lecture_17 {
    public static void main(String[] args) {
        int i = 5;
        double d = 6.5;

        System.out.println(i); // 5
        System.out.println(d); // 6.5

        // int i1 = d; // error: incompatible types: possible lossy conversion from double to int
        double d1 = i;
        System.out.println(d1); // 5.0 

        int i2 = (int) d;
        double d2 = (double) i;
        System.out.println(i2); // 6
        System.out.println(d2); // 5.0

        A objA = new A();
        objA.show1();

        A objA2 = (A) new B(); //// we are going up which is if you try to commpare A and B, A is super class B
                               /// is subclass so we are trying to say object of B but refer to A.so we are
                               /// going up which is up casting.
        objA2.show1();

        B objB = new B();
        objB.show1();
        objB.show2();

        // B objB2 = (B) new A(); // error

        A objA3 = new B();
        objA3.show1();
        // objA3.show2(); // error: cannot find symbol

        B objB2 = (B)objA3; // // this obj is refrence of parent object or parent refrence, we are down
                             // casting it to the child refrence.

                             objB2.show1();
                             objB2.show2();
    }
}

// up casting
class A {
    public void show1() {
        System.out.println("in A show");
    }
}
class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}
