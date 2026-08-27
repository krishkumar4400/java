/**
 * ststic keyword
 * 
 * - static variable
 * - static method
 */


// static variable
class Employee {
    // Instance variable — each object gets its own copy
    String name;
    double salary;

    // Static variable — ONE copy, shared by all Employee objects
    static String companyName = "XYZ Company";
    static int employeeCount = 0;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

        employeeCount++; // Counts total employees created
    }
}

// static methods
class MathUtils {
    // static method - no object needed
    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void circleArea(double radius) {
        System.out.println(Math.PI * radius * radius);
    }
}

// static Methods can't Access Non-Static Variables
class Counter {
    int count = 0; // instance variable
    static int total = 0; // static variable

    // static void show() {
    //     // System.out.println(count); // // ❌ ERROR!
    //     System.out.println(total); // // ✅ OK
    // }

        static void show(Counter c) {
        System.out.println(c.count); // // ✅ OK
        System.out.println(total); // // ✅ OK
    }
}

// Static Block
class Database {
    static String conenctionString;

    // // Runs once when class loads
    static {
        System.out.println("Static block: Loading class...");
        System.out.println("Connection configured: ");
    }

    public Database() {
        System.out.println("Constructor: Creating Database object");
    }
}

// static variable in constructor
class Widget {
    static int count = 0;
    int id;

    Widget() {
        count++; // Update shared counter
        id = count; // Each object gets unique id
    }
}

class A {
    public static void show() {
        System.out.println("in A show");
    }
}
class B extends A {
    @Override
    public void show() {
        System.out.println("in B show");
    }
}

public class Lecture_14 {

    public static void main(String[] args) {
        // static variable
        Employee e1 = new Employee("Alice", 70000);
        Employee e2 = new Employee("Bob", 65000);
        Employee e3 = new Employee("Carol", 80000);

        System.out.println(Employee.employeeCount); // 3 — access via class name
        System.out.println(Employee.companyName);  // XYZ Company (accessible via object too, but not recommended)

        // static method
        // call without creating an object
        MathUtils.add(10, 19);
        MathUtils.circleArea(7);

        Counter.show(new Counter());

        // static block
        Database db1 = new Database();
        Database db2 = new Database();
        // output:
            // Static block: Loading class...
            // Connection configured: 
            // Constructor: Creating Database object
            // Constructor: Creating Database object

    Widget w1 = new Widget();
    System.out.println(Widget.count);
    Widget w2 = new Widget();
    System.out.println(Widget.count);
    Widget w3 = new Widget();
    System.out.println(Widget.count);
    System.out.println(w1.id);
    System.out.println(w2.id);
    System.out.println(w3.id);

    A a = new A();
    B b = new B();
    a.show();
    b.show();
    }
}


// static variables

// class Mobile {
// String brand;
// int price;
// String network;
// static String name;

// public void show() {
// System.out.println(brand + " " + price + " " + network + " " + name);
// }
// }

// public class StaticKeyword {
// public static void main(String[] args) {

// Mobile.name = "SmartPhone";
// Mobile obj1 = new Mobile();
// obj1.brand = "Apple";
// obj1.price = 1500;
// obj1.network = "5G";

// Mobile obj2 = new Mobile();
// obj2.brand = "Samsung";
// obj2.price = 1700;
// obj2.network = "4G";

// // obj1.name = "phone"; // change the value for every object

// obj1.show();
// obj2.show();

// System.out.println(Mobile.name);

// }
// }

// static methods

// class Mobile {
// String brand; // instance variables
// int price;
// static String name; // static variables

// public void show() {
// System.out.println(brand + " " + price + " " + name);
// }

// // public static void show1() {
// // System.out.println("In static method");
// // }
// // public static void show1() {
// // System.out.println(brand + " " + price + " " + name);
// // }
// // public static void show1() {
// // System.out.println(name);
// // }
// public static void show1(Mobile obj) {
// System.out.println(obj.brand + " " + obj.price + " " + name);
// }

// }

// public class StaticKeyword {
// public static void main(String[] args) {

// Mobile.name = "SmartPhone";

// Mobile obj1 = new Mobile();
// obj1.brand = "Apple";
// obj1.price = 1500;

// Mobile obj2 = new Mobile();
// obj2.brand = "Samsung";
// obj2.price = 1700;

// obj1.show();
// obj2.show();

// System.out.println(Mobile.name);

// // Mobile.show(); // error: non-static method show() cannot be referenced
// from a static context
// // Mobile.show1();

// Mobile.show1(obj2);
// Mobile.show1(obj1);

// }
// }

// class Mobile {
// String brand;
// int price;
// static String name;

// // public Mobile() {
// // brand = "";
// // price = 200;
// // name = "Phone"; // everytime the constructor will be called the name which
// is static and common we also be re initialized everytime.
// // }

// static {
// name = "SmartyPhony"; // the good thing about static this is this static
// block will be called only once irrespective of how many object you are
// creating. it will call static block only once
// System.out.println("Static block called");
// }

// public Mobile() {
// brand = "";
// price = 200;
// System.out.println("Constructor called");
// }

// public void show() {
// System.out.println(brand + " " + price + " " + name);
// }
// }

// public class StaticKeyword {
// public static void main(String[] args) {

// // Mobile obj1 = new Mobile();
// // Mobile obj2 = new Mobile();
// // Mobile obj3 = new Mobile();

// }
// }
// /** Output
// * Static block called
// * Constructor called
// * Constructor called
// * Constructor called
// */

class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "SmartyPhony";
        System.out.println("Static block called");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("Constructor called");
    }

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }
}

 StaticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile"); // forname is a method which loads our class.
        // so now if we write this line it will not create an object it will just
        // instantiated.
    }
}
/**
 * Output
 * Static block called
 */