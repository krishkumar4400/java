/**
 *  final Keyword
 * 
The final keyword in Java means "this cannot be changed." It can be applied to variables, methods, and classes, each with a different meaning.

final Variable — Constant Value
 */


class Circle {
    final double PI = 3.14159; // Constant — cannot be reassigned

    void calculate(double r) {
        // PI = 3.14;  // ❌ Compile error: cannot assign a value to final variable

        System.out.println("Area: " + PI * r * r);
    }

// Common pattern for global constants:
public class Constants {
    public static final double TAX_RATE = 0.18;
    public static final int MAX_RETRY = 3;
    public static final String APP_NAME = "MyApp";
}


final int[] arr = {1, 2, 3};
arr[0] = 99;        // ✅ OK — modifying contents, not the reference
arr = new int[]{};  // ❌ Cannot reassign the reference

}

// final Method — Prevent Overriding
class TemplatePrinter {
    // This template must not be changed by subclasses
    public final void printHeader() {
        System.out.println("=== COMPANY REPORT ===");
    }

    public void printBody() {
        // Subclasses can override this
    }
}

class ReportPrinter extends TemplatePrinter {
    // @Override
    // public void printHeader() { } // ❌ Compile error: cannot override final method

    @Override
    public void printBody() {
        System.out.println("Custom body content"); // ✅ Allowed
    }
}

// final Class — Prevent Inheritance
final class ImmutablePoint {
    final int x;
    final int y;

    ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
// class Subclass extends ImmutablePoint { } // ❌ Compile error: cannot inherit from final class

// Real-world examples: String, Integer, Math — all are final classes in Java's standard library. No one can extend String, which protects its immutability guarantee.

public class Lecture_15 {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculate(3);
    }
}     

        

           

              

        

           

         