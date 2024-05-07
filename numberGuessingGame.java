import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    checkNumber();

  }

  public static Integer numberInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess a number inbetween 0 to 100: ");
    int number = scanner.nextInt();
    scanner.nextLine();
    return number;

  }

  public static Integer generateRandomNumber() {
    int randomNumber = (int)(Math.random() * 101);
    return randomNumber;

  }

  public static void checkNumber() {

    //While loop is repeated until the user guesses the correct number.
    int myNumber = generateRandomNumber();
    int userNumber = numberInput();
    Scanner scanner = new Scanner(System.in);
    while (userNumber != myNumber) {
      if (userNumber < myNumber) {
        System.out.println("Your guess is too low. Please try again.");
      } else {
        System.out.println("Your guess is too high. Please try again.");
      }

      // Asking for user input if guessed value was incorrect (while loops starts again )
      userNumber = numberInput(); 

    }

    scanner.close();

    System.out.println("You guessed the correct number!");

  }



}
