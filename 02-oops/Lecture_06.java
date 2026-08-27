/**
 * Polymorphism
 * 
 */

// Compile-time Polymorphism — Method Overloading
class Printer {
    // same name, different parameters
    void print(int n) {
        System.out.println("Printing int  : " + n);
    }

    void print(double d) {
        System.out.println("Printing double : " + d);
    }

    void print(String s) {
        System.out.println("Printing string : " + s);
    }

    void print(int a, int b) {
        System.out.println("Prnting two integers : " + a + ", " + b);
    }
}

// Runtime Polymorphism — Dynamic Method Dispatch
class Computer {

}

class Laptop extends Computer {
}

class A {
    public void show() {
        System.out.println("in A show");
        ;
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    @Override
    public void show() {
        System.out.println("in C show");
    }
}

class D {
    public void show() {
        System.out.println("in D show");
    }
}


// Real-World Example — Payment Processing
abstract class PaymentMethod {
    abstract void processPayment(double amount);
}

class CreditCard extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via Credit Card");
    }
}

class PayPal extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via PayPal");
    }
}

class UPI extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing $" + amount + " via UPI");
    }
}

public class Lecture_06 {
    public static void main(String[] args) {

/**
        Computer obj1 = new Laptop();
        Laptop obj2 = new Laptop();
        // Laptop obj3 = new Computer(); // error - types: Computer cannot be converted
        // to Laptop

        A obj4 = new A();
        A obj5 = new B();
        A obj6 = new C();

        A obj;  // Parent reference — can hold A, B, or C objects
        obj = new A();
        obj.show(); // In A show — obj is actually an A object

        obj = new B();
        obj.show(); // In B show — obj is actually a B object, B's show() called

        obj = new C();
        obj.show();  // In C show — obj is actually a C object, C's show() called

        // The REFERENCE type is A, but behavior depends on OBJECT type

        // A obj7 = new D(); // error - incompatible types: D cannot be converted to A

        Printer p = new Printer();
        p.print(10);
        p.print(10.22);
        p.print("krish");
        p.print(1, 2);
*/

// // One method handles all payment types — polymorphism!
checkout(new CreditCard(), 199.99);
checkout(new PayPal(), 49.50);
checkout(new UPI(), 10.00);

/**
Processing $199.99 via Credit Card
Processing $49.5 via PayPal
Processing $10.0 via UPI
 */
    }
    public static void checkout(PaymentMethod payment, double amount) {
        payment.processPayment(amount); // Runtime decides which processPayment()
    }
}
