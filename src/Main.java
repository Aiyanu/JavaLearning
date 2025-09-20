import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       // if statements
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = sc.nextLine();
        if (name.isEmpty()){
            System.out.println("You didn't enter your name");
        }else{
            System.out.println("Hello, " + name);
        }
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("You are an adult!");
        } else if (age < 0) {
            System.out.println("You haven't been born yet");
        } else{
            System.out.println("You are a minor!");
        }

        sc.close();
    }
}