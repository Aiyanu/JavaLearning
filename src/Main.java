import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       // Java Dice Roller Program

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numOfDice;
        int total=0;

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = sc.nextInt();

        if(numOfDice >0){
            for(int i=0;i< numOfDice;i++){
                int roll = rand.nextInt(1,7);
                System.out.println("You rolled: "+roll);
                printDie(roll);
                total+=roll;
            }
            System.out.println("Total: "+total);
        }else {
            System.out.println("# of dice must greater than 0");
        }
        sc.close();
    }
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------   
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------   
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------   
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------   
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------   
                """;
        String dice6 = """
                 -------
                | ● ● ● |
                | ● ● ● |
                | ● ● ● |
                 -------   
                """;

        switch (roll) {
            case 1-> System.out.print(dice1);
            case 2-> System.out.print(dice2);
            case 3-> System.out.print(dice3);
            case 4-> System.out.print(dice4);
            case 5-> System.out.print(dice5);
            case 6-> System.out.print(dice6);
            default ->  System.out.print("Invalid roll");
        }
    }

}