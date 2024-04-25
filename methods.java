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




// EXAMPLE 

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





//Fill the party list with people you would like to invite to the party and check wether or not he is invited.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    String[] invitedPeople = arrayOfPeople(scanner, "Enter 5 invited people");

    String name = nameToCheck(scanner, "Enter a name to check");
    isInvated(name, invitedPeople);

    String name2 = nameToCheck(scanner, "Enter 2nd name to check");
    isInvated(name2, invitedPeople);

    //printNames(invitedPeople);
  }

  //Method to ask user to add invited people
  public static String[] arrayOfPeople(Scanner scanner, String label) {
    System.out.println(label);
    String[] array = new String[5];
    for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
    }
    return array;
  }
  
  //Method to print out names
  public static void printNames(String[] array) {
    for (String person : array) {
        System.out.println(person);
    }
  }

  //Enter name to check if invited
  public static String nameToCheck(Scanner scanner, String label) {
    System.out.println(label);
    return scanner.nextLine();
  }

  //Checking if name is in the invited list
  public static void isInvated(String name, String[] array){
    boolean isInvated = false;
    for (int i = 0; i < array.length; i++)
      if (array[i].equals(name)) {
        isInvated = true;
        System.out.println("The person is invited");
        break;
      }
    if (isInvated == false) {
      System.out.println("The person is not invited");
    }
    
  }
  
    
}


