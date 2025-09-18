import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String adjective1,noun1,adjective2,verb1,adjective3;

        System.out.print("Enter an adjective: ");
        adjective1 = sc.nextLine();
        System.out.print("Enter an noun: ");
        noun1= sc.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2 = sc.nextLine();
        System.out.print("Enter an verb: ");
        verb1= sc.nextLine();
        System.out.print("Enter an adjective: ");
        adjective3 = sc.nextLine();

        System.out.println("Today I went to a " + adjective1 +" zoo.");
        System. out.println("In an exhibit, I saw a " + noun1 + ".");
        System. out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!") ;
        System.out.println("I was " + adjective3 + "!");
    }
}
