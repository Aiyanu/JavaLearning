import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //User Input
       Scanner scanner = new Scanner(System.in);
       System.out.print("Please enter your name: ");
       String name = scanner.nextLine();
//       System.out.print("Please enter your name: ");
//       String name = scanner.next();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Please enter your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.print("Are you a student(true/false): ");
        boolean isStudent = scanner.nextBoolean();



        System.out.println("Hello "+name);
        System.out.println("You are "+age);
        System.out.println("Your gpa is "+gpa);
        System.out.println("Your gpa is "+gpa);
        if(isStudent){
            System.out.println("You are Student ");
        }else{
            System.out.println("You are not Student ");
        }
//        System.out.println("Student: "+isStudent);

       scanner.close();

    }
}