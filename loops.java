public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int i = 1; // 1
          //1 <= 10 -> TRUE
          //2 <= 10 -> TRUE
          //3 <= 10 -> TRUE
          //...
          //11 <= 10 -> FALSE
    while (i <= 10) {
      String result = ""; // Result
      if (i % 2 == 0) { //Odd or even
        result = "even";
      } else {
        result = "odd";
      }
                        //1 odd
                        //2 even
      System.out.println(i + " " + result);
      i = i + 1; // i = i + 1;
      //i = 1 + 1;
      //i = 2 + 1;
      //i = 3 + 1;
    }
  }
}



// Homework Nr.1 - Create a triangle that is made of _ symbol

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Askins for user input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write a number: ");
    int a = scanner.nextInt();
    scanner.close();

    String triangle = "-";

    for (int i = 1; i <=a; i++) {
      System.out.println(triangle);
        triangle = triangle + "-";
    }
    
  }

}



// Homework Nr.2 - Guess a number

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int myNumber = 24;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess a number inbetween 0 to 100: ");
    int guessedNumber = scanner.nextInt();
    scanner.nextLine();


    //While loop is repeated until the user guesses the correct number.
    while (guessedNumber != myNumber) {
      if (guessedNumber < myNumber) {
        System.out.println("Your guess is too low. Please try again.");
      } else {
        System.out.println("Your guess is too high. Please try again.");
      }

      // Asking for user input if guessed value was incorrect (while loops starts again )
      guessedNumber = scanner.nextInt(); 
      scanner.nextLine();

    }

    System.out.println("You guessed the correct number!");

    scanner.close();

  }

}


/* Develop a program, that iterates through numbers from 0 till X amount of times (X is user provided)
For numbers that are divided by 3: print out "Wo" .

For numbers that are divided by 5: print out "Tech". 

For numbers divided by 3 and 5: print out "WoTech".*/

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner input = new Scanner(System.in);
    int iterations = input.nextInt();
    
    for (int i = 1; i <= iterations; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("WoTech");
      } else if (i % 3 == 0) {
        System.out.println("Wo");
      } else if (i % 5 == 0) {
        System.out.println("Tech");
      } else {
        System.out.println(i);
      }
    } 
    
    
  }

}




import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");

    int number = scanner.nextInt(); //15

    for(int i = 1; i <= number; i++){
      // 1 2 3 4 5 ... 15
      String result = "";
      if (i % 3 == 0){ // 3 6 9 12 15
        result += "Wo";
      } 
      if (i % 5 == 0){ // 5 10 15
        result += "Tech";
      } 
      if(result.equals("")){ //if result is empty
        result = String.valueOf(i); //Then result = i (number)
      }
      System.out.println(result);

      scanner.close();
    }
  }
}


// Finding number in array

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int[] numbers = {1,5,2,8,4,5,6,7,8,9,10};
    System.out.println("Please write Your favorite number: ");
    int favoriteNumber = myObj.nextInt();

    boolean isFound = false;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == favoriteNumber) {
        isFound = true;
        break;
      } 
    }

    if(isFound) {
       System.out.println("Your favorite number is in the array");
    } else {
       System.out.println("Your favorite number is not in the array");
    }
    
  }

  
}
