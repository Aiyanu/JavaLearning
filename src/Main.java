import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Compound Interest Calculator
        Scanner sc = new Scanner(System.in);

        double principal,rate,amount;
        int timeCompounded,years;

        System.out.print("Enter the principal: ");
        principal = sc.nextDouble();
        System.out.print("Enter the rate (in %): ");
        rate = sc.nextDouble()/100;
        System.out.print("Enter the number of times compounded per year: ");
        timeCompounded = sc.nextInt();
        System.out.print("Enter number of years:");
        years = sc.nextInt();

        amount = principal*Math.pow(1+(rate/timeCompounded),timeCompounded*years);
        System.out.printf("The amount after %d is $%,.2f",years,amount);
        sc.close();
    }
}