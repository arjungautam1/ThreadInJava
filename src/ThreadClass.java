
/* Created by Arjun Gautam */

public class ThreadClass extends Thread {
    public void run() {
        System.out.printf("Thread created with Thread class is running.");
    }

    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        t1.start();
    }
}
