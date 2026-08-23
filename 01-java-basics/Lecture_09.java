/**
 * == and equals()
 * 
What is the difference between == and .equals() in Java?

== compares references (memory addresses) for objects. For primitives, it compares values.
.equals() compares content/value of objects.
"hello" == "hello" may be true (string pool), but new String("hello") == new String("hello") is false.

 */


public class Lecture_09 {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        // ==
        System.out.println(s1 == s2); // true
        System.out.println(2 == 2); // true

        String s3 = new String("krish");
        String s4 = new String("krish");
        System.out.println(s3 == s4); // s4

        // equals()
        
        System.out.println("Equals:-");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(4)); // false
        System.out.println(s3.equals(s4)); // true
    }
}