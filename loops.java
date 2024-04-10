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






