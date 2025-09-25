import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
//        thread.start();

//        System.out.println("You have 10 seconds to enter your name");
//        System.out.print("Enter your name:");
//        String name = sc.nextLine();
//        System.out.println("Hello "+name);
        sc.close();
        Thread thread1 = new Thread(new MultiThreading("Ping"));
        Thread thread2 = new Thread(new MultiThreading("Pong"));
        System.out.println("Game Start");
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread was interrupted");
        }
        System.out.println("Game Over");
    }
}