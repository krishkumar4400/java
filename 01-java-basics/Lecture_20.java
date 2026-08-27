import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Lecture_20
 */
public class Lecture_20 {

    public static void main(String[] args) throws IOException {
        // method 1
        // System.out.println("Enter a number");
        // int val = System.in.read(); // it gives the ascii value for entered value
        // System.out.println(val);
        // System.out.println(val - 48);

        // method 2
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // System.out.println("Enter a number: ");
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n);

    }
}