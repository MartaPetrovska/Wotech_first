// Fill the array with random numbers and summarize them all

public class Main {
  public static void main(String[] args) {
    
    int[] arr = new int[5];
    
    for (int i = 0; i < arr.length; i++){
    int randomNum = (int)(Math.random() * 101);
    arr[i] = randomNum;
    System.out.println(arr[i]);
    }

    int sum = 0;

    for (int i = 0; i < arr.length; i++){
      sum = sum + arr[i];
    }
    System.out.println(sum);
  }

}


// Find all the elements in the array that is below 0

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner arrayInput = new Scanner(System.in);  
    
    int[] array = new int[5];

    System.out.println("Enter 5 numbers: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = arrayInput.nextInt();
    }

    System.out.println("The numbers you entered are: ");
    for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
    }

    System.out.println("Negative numbers from Your list are: ");
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0)
        System.out.println(array[i]); 
    }

    arrayInput.close();
    
  }
}

// Fill the party list with people you would like to invite to the party and check if corresponding person is invited.

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner arrayInput = new Scanner(System.in);  
    
    String[] array = new String[5];

    System.out.println("Enter 5 names: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = arrayInput.nextLine();
    }

    System.out.println("The names you entered are: ");
    for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
    }

    System.out.println("Name You want to check: ");
    String name = arrayInput.nextLine();

    boolean isFound = false;
    
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(name)) {
        isFound = true;
        break;
      }
    }

    if (isFound) {
      System.out.println("Name is found");
    } else {
      System.out.println("Name is not found");
    }

    arrayInput.close();
    
  }

}




//Given an array of integers, write a Java program to find the maximum sum of two integers in the array.

public class Main {
  public static void main(String[] args) {
    int[] arr = new int[5]; 

    for (int i = 0; i < arr.length; i++){
    int randomNum = (int)(Math.random() * 101);
    arr[i] = randomNum;
    System.out.println(arr[i]);
    }

    int sum = 0; 

    for (int i = 0; i < arr.length; i++){
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] > sum) {
          sum = arr[i] + arr[j];
        }
      }
    }
      
    System.out.println(sum);
  }

}




//Find the amount of different words in the array

//1st example

public class Main {
  public static void main(String[] args) {
    
    String[] arr = {"Anna","Marta","Anna","Ieva", "Ieva"}; 

    for (int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
    }

    int sum = 0;

    for (int i = 0; i < arr.length; i++){
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i].equals(arr[j])) {  
          sum = sum + 1;
        }
      }
    }
      
    System.out.println("There is " + (arr.length - sum) + " pairs of names");
  }

}


//2nd example with printing out unique words.

import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    
    String[] arr = {"Anna","Marta","Anna","Ieva", "Ieva", "Lauma"}; 
    ArrayList<String> names = new ArrayList<String>();

    for (int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
    }

    int sum = 0;

    for (int i = 0; i < arr.length; i++){
      boolean isFound = false;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i].equals(arr[j])) {  
          sum ++;
          isFound = true;
          break;
        } 
      }
      
      if (!isFound) {
        names.add(arr[i]);
      }
    }
      
    System.out.println("There are " + (arr.length - sum) + " pairs of names.");
    System.out.println("Unique names:");
    for (String name : names) {
        System.out.println(name);
    }
  }

}
