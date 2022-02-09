import java.io.File;  // Import the File class
import java.io.IOException;    // Import this class to handle errors
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; // Import the Scanner class to read text files

public class Game{

 // fuction to captialize the first letter of the user's answer
                                
    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }else{
            return str.substring(0, 1).toUpperCase() + str.substring(1);
         }     
         
    }

     // check the lenght of the user response

     public static boolean isUserResponseCorrectLength(String st){
         if(st.length() > 5 || st.length() < 5)
            return false;
        
        return true;
     }

    public static void changeTheWord (String st){
                if(!isUserResponseCorrectLength(st)){
                    System.out.println("The length of your word is either too short or too long. Please enter a new 5 letter word.");     
                }
            }


     // method to check if the user's input matches the guess word
    public static boolean isYourGuessCorrect(String x, String y){
        if(x.compareToIgnoreCase(y) < 0)
            return false;

        if(x.compareToIgnoreCase(y) > 0)
            return false;
        
        if(x.compareToIgnoreCase(y) != 0)
            return false;

        return true;
    } 

    public static void checkForTheWrongAnswer(String x , String y){
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == y.charAt(i)){
                System.out.print(x.charAt(i));
            }else{
                System.out.print("__ ");
            }  
          } 
    }
    public static void main(String[] args) {
        /*
           //TO DO:
                // STEP 4 A: making sure the correct word matches with the random generated word :: GENESIS
                // STEP 5: when there is a letter in the word but not in the right place :: COMFORT
                // STEP 5 A : make sure step 5 works with the randomly generated word :: COMFORT
                // STEP 6: set a limit for the user to only respond 5 times :: GENESIS
                            // while (tries > 5){

                        // }
                // STEP 7; if there is time: work on asthetics :: COMFORT
                          

        */

        
                                
                 
        try {
        	 // STEP 1: read the text file into an ArrayList
            File myObj = new File("WordsList.txt");
            Scanner myScanner = new Scanner(myObj);
            ArrayList<String> words = new ArrayList<>();
            
            while(myScanner.hasNext()){
                words.add(myScanner.nextLine());
                }
            
            myScanner.close();
                
            // STEP 2: generating random words
                Random rand = new Random(System.currentTimeMillis());
                String guessWord = words.get(rand.nextInt(words.size()));

               //System.out.println(guessWord);
               String correctResponse = " is the correct answer! Excellent work!";

                // STEP 3: get user answer input
            try (
                Scanner word = new Scanner(System.in)) {
                System.out.println("Hello, Welcome to Burdle.... the best game on the web currently!");
                System.out.println();
                System.out.println("Here are some simple rules for this game. You will have 5 attempt to correctly guess the word of today" + " This word is a 5 letter word and it can be any 5 letter word you can think of.");
                System.out.print("If you guess the word incorrectly, you will see if any of the letters in your words matches correctly to the guess word of the day. If not, you will have to keep guessing until your chances are up or until you guess the word correctly");
                System.out.println();
                System.out.println(" Are you ready to try .....!");
                System.out.println();

                String userInput1 = word.nextLine();   // user response to question 
                String capUserInput1 = userInput1.substring(0, 1).toUpperCase() + userInput1.substring(1);
                System.out.println();


                for(int userAttemptGame = 0; userAttemptGame <1; ){
                    if(isUserResponseCorrectLength(capUserInput1)){
                                if(isYourGuessCorrect(guessWord, capUserInput1)){
                                        System.out.println(guessWord + correctResponse);
                                        break;
                                }else {
                                        for(int i = 0; i < 5; i++){
                                            checkForTheWrongAnswer(guessWord, capUserInput1); 
                                            System.out.println();
                                            System.out.println("based on your answer, attempt again");
                                            System.out.println();
                                            String userInput3 = word.nextLine();
                                            String capUserInput3 = userInput3.substring(0, 1).toUpperCase() + userInput3.substring(1);
                                            capUserInput1 = String.valueOf(capUserInput3);
                                                // checking to see if user new inputs are correct
                                                    if(isYourGuessCorrect(guessWord, capUserInput1)){
                                                        System.out.println(guessWord + correctResponse);
                                                    }else{
                                                        System.out.println();
                                                    }
                                        } 
                                       
                                        break;
                                    }
                            
                    }else{
                        changeTheWord(capUserInput1);
                        String userInput2 = word.nextLine();
                        String capUserInput2 = userInput2.substring(0, 1).toUpperCase() + userInput2.substring(1);
                        capUserInput1 = String.valueOf(capUserInput2);

                        Boolean checkTheUserNewInput = isYourGuessCorrect(guessWord, capUserInput1);

                        // check if the new input matches the correct guess
                                if(Boolean.TRUE.equals(checkTheUserNewInput)){
                                    System.out.println();
                                    System.out.println(guessWord + correctResponse);
                                    break;
                                } else{
                                        for(int i = 0; i < 5; i++){
                                            checkForTheWrongAnswer(guessWord, capUserInput1); 
                                            System.out.println();
                                            System.out.println("based on your answer, attempt again");
                                            System.out.println();
                                            String userInput3 = word.nextLine();
                                            String capUserInput3 = userInput3.substring(0, 1).toUpperCase() + userInput3.substring(1);
                                            capUserInput1 = String.valueOf(capUserInput3);
                                            System.out.println();
                                                // checking to see if user new inputs are correct
                                                if(isYourGuessCorrect(guessWord, capUserInput1)){
                                                    System.out.println(guessWord + correctResponse);
                                        }else{
                                                System.out.println();
                                            }
                                                
                                    }
                                        
                                    break;
                                }

                    }

                    
                

                }System.out.println();
                System.out.println("GAME OVER!");

                
                
                        
                        
                

            }
    
        
        } catch (IOException e) {
            System.out.println(" An error has occurred. ");
            e.printStackTrace();
            

        }
    }
}