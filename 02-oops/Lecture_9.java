/**
 * 
 */


public class Lecture_9 {
    public static void main(String[] args) {
        MyThread tMyThread = new MyThread();
        Thread t1Thread = new Thread(tMyThread);
        t1Thread.start();
    }
}
