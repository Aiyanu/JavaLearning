import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        //Countdown timer program
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seconds to countdown from: ");
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = sc.nextInt();

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task,0,1000);
    }
}