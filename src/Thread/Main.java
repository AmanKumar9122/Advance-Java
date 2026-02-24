package Thread;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.setName("Aman");
        System.out.println(myThread.getName());
        System.out.println(myThread.getPriority());
//        myThread.run();
        myThread.start();
        System.out.println("Main");
        System.out.println(myThread.isAlive());
        myThread.join();
        System.out.println("end///////////////////");
    }
}
