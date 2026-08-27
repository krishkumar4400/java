/**
 * String
 * 
 * What is a String?
 * In Java, a String is a sequence of characters. Unlike in C, Java Strings are
 * objects (instances of java.lang.String), not arrays of chars (though
 * internally they use a char array or byte array).
 * 
 * String name = "Alice";
 * // OR
 * String name = new String("Alice");
 * 
 * Immutability — The Most Critical String Concept
 * Java Strings are immutable — once created, their value cannot be changed.
 * 
 * When you "modify" a String, you're actually creating a brand new String in
 * memory.
 * 
 * String s = "Hello";
 * s = s + " World"; // Does NOT modify "Hello"
 * // Creates a NEW String "Hello World"
 * // 's' now points to the new String
 * // "Hello" is now orphaned (eligible for GC)
 * 
 * 
 * Dry Run
 * Step 1: String s = "Hello"
 * Heap: ["Hello"] ← s points here
 * 
 * Step 2: s = s + " World"
 * Heap: ["Hello"] (orphaned)
 * ["Hello World"] ← s now points here
 * 
 * The original "Hello" was NOT changed.
 * 
 * Why are Strings Immutable?
 * Security — Strings are used for passwords, file paths, network connections.
 * Immutability prevents malicious changes.
 * String Pool efficiency — Multiple variables can safely share the same String
 * object.
 * Thread safety — Immutable objects are inherently thread-safe.
 * HashCode caching — Hash is computed once and cached, enabling efficient use
 * in HashMap/HashSet.
 * 
 * 
 * 
 */

public class Lecture_10 {

    public static void main(String[] args) {
        String s1 = "krish";
        String s2 = s1;
        System.out.println(s1);
        System.out.println(s2);

        s2 = "john";
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.length());

        /**
         * The String Pool (String Intern Pool)
         * The String Pool is a special area in the Heap (since Java 7; was in PermGen
         * before) where String literals are stored and reused.
         */

        /**
         * String Pool (part of Heap) Regular Heap
         * ┌────────────────────────────┐ ┌─────────────────┐
         * │ "Hello" ← a, b point here │ │ "Hello" ← c │
         * └────────────────────────────┘ └─────────────────┘
         * 
         */

        String a = "Hello"; // "Hello" stored in String Pool
        String b = "Hello"; // "Hello" already exists — reuses same object!

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == b); // true (same reference!)
        System.out.println(a.equals(b)); // true (same content)

        String c = new String("Hello"); // Forces NEW object in heap (outside pool)
        System.out.println(a == c); // false (different objects!)
        System.out.println(a.equals(c)); // true (same content)

        // Golden Rule: Always use .equals() to compare String content, never ==.

        // String Methods
        String s3 = "  Hello, World !  ";

        System.out.println(s3.length()); // 18
        System.out.println(s3.trim()); // "Hello, World!" (removes leading/trailing whitespace)
        System.out.println(s3.length()); // 18
        System.out.println(s3.toLowerCase()); // " hello, world! "
        System.out.println(s3.toUpperCase()); // " HELLO, WORLD! "
        System.out.println(s3.charAt(2)); // 'H' (index 2 of trimmed... wait, 2 is space here)
        System.out.println(s3.indexOf("World")); // 9
        System.out.println(s3.contains("Hello")); // true
        System.out.println(s3.startsWith("  He")); // true
        System.out.println(s3.endsWith("  ")); // true
        System.out.println(s3.replace("Hello", "Hi")); // " Hi, World! "
        System.out.println(s3.substring(2, 7)); // "Hello"
        System.out.println(s3.split(", ")); // [" Hello", "World! "]
        System.out.println(s3.isEmpty()); // false
        System.out.println(s3.isBlank()); // false (Java 11+) — checks whitespace only strings too

        /**
         * String Concatenation Pitfall
         * Concatenating Strings with + in a loop is very slow because each + creates a
         * new String object.
         * 
         * 
         */
        // ❌ BAD — O(n²) performance
        String result1 = "";
        for (int i = 0; i < 10000; i++) {
            result1 += "a"; // Creates 10000 String objects!
        }

        // ✅ GOOD — Use StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("a"); // Modifies one object
        }
        String result2 = sb.toString();

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        StringBuffer sb2 = new StringBuffer("krishna");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());

        sb2.append(" Kumar");
        System.out.println(sb2);

        // String st1 = sb2; // StringBuffer cannot be converted to String
        // System.out.println(st1);

                // methods
        String s3 = sb2.toString();
        System.out.println(s3);

        System.out.println(sb2);
        sb2.delete(5, 7);
        System.out.println(sb2);
        
        sb2.insert(0, "Java ");
        System.out.println(sb2);

        sb2.insert(11, "Java ");
        System.out.println(sb2);
    }

}