
/* Created by Arjun Gautam */

public class ThreadClassR implements Runnable{
    public void run(){
        System.out.printf("Thread created using Runnable Interface");
    }

    public static void main(String[] args) {
        ThreadClassR m1=new ThreadClassR();
        Thread t1=new Thread(m1);
        t1.start();
    }
}
