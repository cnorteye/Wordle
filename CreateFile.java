import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args) {
        try {
            File myOjb = new File("WordsList.txt");
            if(myOjb.createNewFile()){
                System.out.println("File create: " + myOjb.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
    
}
