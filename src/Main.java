import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Enums
        System.out.print("Enter a day of the week: ");
        try(
                Scanner sc = new Scanner(System.in);

                ){
            String response = sc.nextLine().toUpperCase().trim();
            Day day = Day.valueOf(response);

            System.out.println(day);

            switch(day) {
                case SUNDAY,SATURDAY-> System.out.println("It is a weekend");
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY-> System.out.println("It is a weekend");

            }
        }
            catch(IllegalArgumentException e){
                System.out.println("Day does not exist");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}