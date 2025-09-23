import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //How to write files using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)
        String filePath = "./test.txt";
        String textContent = """
                I want to buy Shawarma
                Please buy me Shawarma
                """;
        try(FileWriter fw = new FileWriter(filePath)){
            fw.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        }
        catch (IOException e){
            System.out.println("Could not write to file");
        }
    }
}