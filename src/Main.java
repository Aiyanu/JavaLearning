import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Weight Conversion Program

        Scanner sc = new Scanner(System.in);

        double weight,newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lb(s) to kg(s)");
        System.out.println("2: Convert kg(s) to lb(s)");

        System.out.print("Choice Option:");
        choice = sc.nextInt();

        System.out.print("Enter weight ");
        weight = sc.nextDouble();

        if (choice == 1){
            newWeight = weight * 0.453592;
            System.out.printf("The weight is %.2fkg(s) ", newWeight);
        }else if (choice==2){
            newWeight = weight / 0.453592;
            System.out.printf("The weight is %.2flb(s) ", newWeight);
        }else{
            System.out.println("Invalid choice.");
        }
    }
}