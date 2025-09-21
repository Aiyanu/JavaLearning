import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       //Calculator program
        Scanner sc = new Scanner(System.in);
        double num1,num2,result=0;
        char operator;
        boolean validOperator=true;

        System.out.println("Please enter the first number:");
        num1 = sc.nextDouble();

        System.out.println("Enter an Operator(+,-,*,/,^): ");
        operator = sc.next().charAt(0);//char at will convert it from a string to a char

        System.out.println("Please enter the second number:");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                else result = num1 / num2;
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperator=false;
            }
        }

        if(validOperator)System.out.println(result);

        sc.close();
    }
}