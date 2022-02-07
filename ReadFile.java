import java.io.File;  // Import the File class
import java.io.IOException;    // Import this class to handle errors
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile{
    public static void main(String[] args) {

        //TO DO:

                 
        try {
        	 // read the text file into an ArrayList
            File myObj = new File("WordsList.txt");
            Scanner myScanner = new Scanner(myObj);
            ArrayList<String> words = new ArrayList<String>();
            while(myScanner.hasNext()){
                words.add(myScanner.nextLine());
                }
                
                // generating random words
            Random rand = new Random(System.currentTimeMillis());
            String guessWord = words.get(rand.nextInt(words.size()));
            //System.out.println(guessWord);


            // get user answer input
            Scanner guess = new Scanner(System.in);
            System.out.println("Hello, Welcome to Burdle.... the best game on the web currently!");
            System.out.println("Enter a 5 letter word to guess the word of the day.");
            String userAnswer = guess.nextLine();   // user response to question
                    

          // check to make sure the user input is not more than 5 words
                if(userAnswer.length() > 5){
                    System.out.println("Your guess word is too long. Try to guess a 5 letter word");
                    String newAnswer = guess.nextLine();
                    System.out.println(newAnswer);

                }else{
                        System.out.println(userAnswer);  // printing out the user response
            
                }

        
                // checking to make sure user's input matches with our guess word

              // System.out.println("Guess a five letter word");
                Scanner scan = new Scanner(System.in); 

                // test word 
                String correctWord=("house");
                String wordGuess,dash="-";
                
                int numGuesses= 5;
              wordGuess= scan.nextLine(); // scanning in character from keyboard
                
                if (correctWord.contains(wordGuess)) {
                    int guessedIndex=correctWord.indexOf(wordGuess);
         
                    String outString="";
         
                  for(int i=0;i<guessedIndex;i++){
                        outString+=dash; //repeat dash until we get to the correctly guessed letter
                    }
         
                    outString+=wordGuess; //put the letter in
         
                    for(int i=guessedIndex;i<correctWord.length();i++){
                        outString+=dash; //repeat dash until we get to end of the word
                    }
         
                    System.out.println(outString);
                } else{
                    System.out.println("end of code");
                }


            
        } catch (IOException e) {
            System.out.println(" An error has occurred. ");
            e.printStackTrace();
            

        }
    }
}