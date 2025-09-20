import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //String Methods

        String name = "Iyanu Adesanya";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("a");
        int lastIndex = name.lastIndexOf("a");

        name = name .toUpperCase();
        name = name.toLowerCase();
        name=name.trim();
        name=name.replace("o","a");

        boolean isEmpty=name.isEmpty();
        boolean contains=name.contains("a");
        boolean isEqual = name.equals("name");
        boolean isEqual2 = name.equalsIgnoreCase("");

        String email = "aiyanu1.00@gmail.com";
        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);


        System.out.println(username);
        System.out.println(domain);
    }
}