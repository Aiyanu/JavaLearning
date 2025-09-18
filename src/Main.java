import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char currency = '₦';
        String item;
        int quantity;
        double totalPrice,price;
        Scanner sc = new Scanner(System.in);
        System.out.print("What item would you like to buy? ");
        item = sc.nextLine();
        System.out.print("What is the price for each? ");
        price = sc.nextDouble();
        System.out.print("How many would you like to buy? ");
        quantity = sc.nextInt();

        totalPrice = price * quantity;
        System.out.println("You have bought "+quantity+" "+item+"/s");
        System.out.printf("Your total is %c%.2f",currency,totalPrice);
        sc.close();
    }
}