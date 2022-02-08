import java.io.File;  // Import the File class
import java.io.IOException;    // Import this class to handle errors
import java.util.ArrayList;
import java.util.Objects; 
import java.util.Random;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile{

 // fuction to captialize the first letter of the user's answer
                                
    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }else{
            return str.substring(0, 1).toUpperCase() + str.substring(1);
         }     
     }  

     // method to check if the user's input matches the guess word
    public static void isYourGuessCorrect(String x, String y){
        if(x.compareToIgnoreCase(y) == 0){
            System.out.println(x);
        } else{
            for(int i = 0; i < x.length(); i++){
                if(x.charAt(i) == y.charAt(i)){
                    System.out.print(x.charAt(i));
                }else{
                    System.out.print("__");
                }
            
            }
        }
        

    }

    public static void main(String[] args) {
        /*
            

        */

        //TO DO:
                // STEP 4 A: making sure the correct word matches with the random generated word :: GENESIS
                // STEP 5: when there is a letter in the word but not in the right place :: COMFORT
                // STEP 5 A : make sure step 5 works with the randomly generated word :: COMFORT
                // STEP 6: set a limit for the user to only respond 5 times :: GENESIS
                            // while (tries > 5){

                        // }
                // STEP 7; if there is time: work on asthetics :: COMFORT
                         
                                
                 
        try {
        	 // STEP 1: read the text file into an ArrayList
            File myObj = new File("WordsList.txt");
            Scanner myScanner = new Scanner(myObj);
            ArrayList<String> words = new ArrayList<String>();
            while(myScanner.hasNext()){
                words.add(myScanner.nextLine());
                }
                
            // STEP 2: generating random words
                Random rand = new Random(System.currentTimeMillis());
                String guessWord = words.get(rand.nextInt(words.size()));

                System.out.println(guessWord);


            // STEP 3: get user answer input :: COMFORT
            
                        Scanner guess = new Scanner(System.in);
                        System.out.println("Hello, Welcome to Burdle.... the best game on the web currently!");
                        System.out.println("Enter a 5 letter word to guess the word of the day.");
                        String userAnswer = guess.nextLine();   // user response to question 
                        String capUserAnswer = userAnswer.substring(0, 1).toUpperCase() + userAnswer.substring(1);
                        
                        
                                

                        // STEP 3 A. check to make sure the user input is not more than 5 words
                        if(capUserAnswer.length() > 5){
                            System.out.println("Your guess word is too long. Try to guess a 5 letter word");
                            String newAnswer = guess.nextLine();
                            userAnswer = String.valueOf(newAnswer);
                            //System.out.println(capitalize(newAnswer));

                        }
             

                      isYourGuessCorrect(guessWord, userAnswer);
                        

            
        } catch (IOException e) {
            System.out.println(" An error has occurred. ");
            e.printStackTrace();
            

        }
    }
}