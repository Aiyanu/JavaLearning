import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //How to read files using Java (3 popular options)

        // BufferedReader + FileReader = Best for reading text files line-by-line
        // RandomAccessFile = Best for reading specific portions of a large file
        // FileInputStream = Best for binary files (e.g., images, audio files)
        String filePath = "C:\\Users\\DELL\\OneDrive\\Desktop\\Testing.txt";




        try(BufferedReader br = new BufferedReader(new FileReader(filePath));){
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
//            System.out.println("The file exists");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}