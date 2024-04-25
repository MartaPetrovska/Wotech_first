/* Create a program, where user can provide a title and a small text below the title.
Title should be wrapped with ====== at top and bottom, based on the title length.
Example: 
System asks for title and user provides "WoTech and Java is easy"
System asks for description and user provides "I have been learning Java for 6 weeks now." */


import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    //Creating scanner
    Scanner scanner = new Scanner(System.in);

    //Calling method for getting title
    System.out.print("Enter a title: ");
    String title = getText();

    System.out.print("Enter a description: ");
    String description = getText();

    //Calling method to get printout with lines
    getPrintout(title, description);

    //Closing scanner
    scanner.close();
  }

  // Method to ask user for description
  public static String getText() {
    Scanner scanner = new Scanner(System.in);

    //Read user input
    String text = scanner.nextLine();

    //Return user input
    return text;
  }

    // Method to display the result with the title wrapped in = characters + description

  public static void getPrintout(String title, String description) {

    // Calc length
    int length = title.length();
    // Create top border
    printBorder(length);
    // Display the title
    System.out.print(title);

    System.out.println(""); // Jumps to next line
    // Create bottom border
    printBorder(length);

    // Display the description
    System.out.println(""); // Jumps to next line
    System.out.println(description);

  }

  public static void printBorder(int length){
    for (int i = 0; i < (length); i++) {
      System.out.print("=");
    }
    System.out.println("");
  }
}




// OOSKARS EXAMPLE 

public class Main {
  public static void main(String[] args) {
    int number = 51;

    checkNumber(number);

    int number2 = 49;
    
    checkNumber(number2);
  }

  public static void checkNumber(int number){
    if(number > 50){
      System.out.println("Number is greater than 50");
    }else if(number < 50){
      System.out.println("Number is less than 50");
    }else{
      System.out.println("Number is equal to 50");  
    }
  }
}
