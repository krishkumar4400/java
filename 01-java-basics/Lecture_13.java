/**
 * Constructors
 * 
 * A constructor is a special method that is called automatically when an object is created. Its purpose is to initialize the object's state.
 * 
 * 
Constructor name must match the class name exactly
Constructor has no return type (not even void)
Called automatically with the new keyword
A class can have multiple constructors (constructor overloading)
If you don't write a constructor, Java provides a default constructor

 */

class Dog {
    public String name;
    public String breed;

    // default constructor
    public Dog() {
        this.name = "unknown";
        this.breed = "mixed";
        System.out.println("Dog object created (default)");
    }
}

public class Dog {
            String name;
            String breed;
            int age;

            public Dog(String name, String breed, int age) {
                this.name = name;
                this.breed = breed;
                this.age = age;
            }
        }


        public class Rectangle {
            double width;
            double height;

            // No-arg: creates 1x1 rectangle
            public Rectangle() {
                this(1.0, 1.0); // Calls the two-arg constructor (using this())
            }

            // Square (only one size needed)
            public Rectangle(double side) {
                this(side, side);
            }

            // Full constructor
            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            double area() {
                return width * height;
            }
        }




 

public class Lecture_13 {
    public static void main(String[] args) {
        // default
        Dog d = new Dog();// Calls default constructor
        // Output: Dog object created (default)
        System.out.println(d.name);

        // parameterized
        Dog d1 = new Dog("Buddy", "Labrador", 3);
        Dog d2 = new Dog("Max", "Poodle", 5);

        // constructor overloading
                Rectangle r1 = new Rectangle(); // 1x1
        Rectangle r2 = new Rectangle(5.0); // 5x5 square
        Rectangle r3 = new Rectangle(4.0, 6.0); // 4x6
    }
}