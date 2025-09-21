import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       //Temperature Converter

        Scanner sc = new Scanner(System.in);

        double temp;
        String unit;

        System.out.print("Please enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = sc.next().toUpperCase();

        double newTemp = (unit.equals("C"))?(temp- (32 * 5) /9):((temp*5/9)+32);

        System.out.printf("%.1f°%s",newTemp,unit);

//        System.out.println(temp);
//        System.out.println(unit);
        sc.close();
    }
}