import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class GuessWord{
   public static void main(String[] args) {
	  
       Random rand = new Random(System.currentTimeMillis());
       File myObj = new File("WordsList.txt");
       ArrayList<String> words = new ArrayList<String>();
	String correctWord = words.get(rand.nextInt(words.size()));
	 System.out.println(correctWord);
       String correctWord2=correctWord;
       String wordGuess,dash="-";
       System.out.println("Guess a five letter word");
       Scanner scan = new Scanner(System.in);
       
       
       try {
           Scanner myScanner = new Scanner(myObj);
         
           while(myScanner.hasNext()){
               words.add(myScanner.nextLine());
               }
       
       }
        catch (IOException e) {
           System.out.println(" An error has occurred. ");
           e.printStackTrace();
       }
       
       
       int numGuesses= 5;
     wordGuess= scan.nextLine(); // scanning in character from keyboard
       
       if (correctWord2.contains(wordGuess)) {
           int guessedIndex=correctWord2.indexOf(wordGuess);

           String outString="";

         for(int i=0;i<guessedIndex;i++){
               outString+=dash; //repeat dash until we get to the correctly guessed letter
           }

           outString+=wordGuess; //put the letter in

           for(int i=guessedIndex;i<correctWord2.length();i++){
               outString+=dash; //repeat dash until we get to end of the word
           }

           System.out.println(outString);
       } else { 
       
     
       }}}