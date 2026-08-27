/**
 * abstraction
 */

abstract class Shape {
    // Abstract method — NO implementation, MUST be overridden by subclasses
    public abstract double area();

    public void describe() {
        System.out.println("I am a shape with area: " + area());
    }
}

class Circle extends Shape {
    @Override
    public double area() {
        return 29.321;
    }
}

abstract class Vehicle {
    String brand;
    int year;

    // Constructor (called by subclasses)
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Abstract method — every vehicle starts differently
    public abstract void start();

    // Abstract method — every vehicle has different fuel capacity
    public abstract double fuelCapacity();

    // Concrete method — same for all vehicles
    public void displayInfo() {
        System.out.println(brand + " (" + year + ") - Fuel: " + fuelCapacity() + "L");
    }
}

class Car extends Vehicle {
    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("car starts with a key turn");
    }

    @Override
    public double fuelCapacity() {
        return 50.0;
    }
}

class MotorCycle extends Vehicle {
    public MotorCycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle starts with a kick/button");
    }

    @Override
    public double fuelCapacity() {
        return 15.0;
    }
}

public class Lecture_07 {
    public static void main(String[] args) {
        Shape obj = new Circle();
        System.out.println(obj.area());
        obj.describe();

        // Usage
        // Vehicle v = new Vehicle("Toyota", 2023); // ❌ Cannot instantiate abstract
        // class
        Vehicle car = new Car("Toyota", 2023); // upcasting
        car.start();
        car.displayInfo();

        Vehicle moto = new MotorCycle("Honda", 2025);
        moto.start();
        moto.displayInfo();

        /**
         * output
         * 
         * car starts with a key turn
         * Toyota (2023) - Fuel: 50.0L
         * Motorcycle starts with a kick/button
         * Honda (2025) - Fuel: 15.0L
         */
    }
}
