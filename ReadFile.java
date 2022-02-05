import java.io.File;  // Import the File class
import java.io.IOException;    // Import this class to handle errors
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile{
    public static void main(String[] args) {

        // read text file into an ArrayList
        try {
            File myObj = new File("WordsList.txt");
            Scanner myScanner = new Scanner(myObj);
            ArrayList<String> words = new ArrayList<String>();
            while(myScanner.hasNext()){
                words.add(myScanner.nextLine());
                }
                
                // generating random words
            Random rand = new Random(System.currentTimeMillis());
            String guessWord = words.get(rand.nextInt(words.size()));
            System.out.println(guessWord);
          
            

            
            
        } catch (IOException e) {
            System.out.println(" An error has occurred. ");
            e.printStackTrace();
        }
    }
}