import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Random Class
       Random rand = new Random();

       int randInt1;
       double randDouble;
       boolean randBoolean;

        randInt1 = rand.nextInt(1,7);
        randDouble = rand.nextDouble();
        randBoolean = rand.nextBoolean();

        System.out.println(randInt1);
        System.out.println(randDouble);
        System.out.println(randBoolean);
    }
}