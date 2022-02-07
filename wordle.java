import java.util.Scanner;
import java.util.Random;


public class wordle{
   public static void main(String[] args) {
     // may need it later on to develope the game
	   
			
       System.out.println("Guess a five letter word");
       Scanner scan = new Scanner(System.in);
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
       } else { 
       
     
  }}}
		
   


