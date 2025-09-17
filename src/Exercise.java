import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //calculate the area of a rectangle

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the Width: ");
        double width = sc.nextDouble();

        System.out.println("The area of the rectangle is "+calculateArea(length,width));
        sc.close();
    }
    public static double calculateArea(double length,double width){
        return length*width;
    }
}
