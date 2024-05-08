import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int lives = 6;
    String word = "hello";
    int lettersGuessed = 0;
    boolean letterFound = false;
    System.out.println("Hello! This is Hangman game where you have 6 attempts to guess a name. Let's get started. Guess a letter: ");
      
    //While loop which compares added letter to each letter in the word.
      while (lives > 0 && lettersGuessed != word.length()) {
        String letter = scanner.nextLine();
        letterFound = false;
        for (int i = 0; i < word.length(); i++) {
          if (word.charAt(i) == letter.charAt(0)) {
            System.out.println("Correct! The letter is in " + (i+1) + " position");
            lettersGuessed ++ ;
            letterFound = true;
          }
        }

        //If statements about steps if letter is correct or not. 
        if (letterFound) {
          System.out.println("Add next letter.");
        } else {
          lives--;
          System.out.println("Wrong! You have left " + lives + " lives. Try again");
        }
      }

    // If statement to check ending of the game - you won or you lose. 
    if (lettersGuessed == word.length()) {
      System.out.println("You have guessed the word '" + word + "' correctly!");
    } else {
      System.out.println("You have run out of lives. The word was '" + word + "'.");
    }
      
  }
}
