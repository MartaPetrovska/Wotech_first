// Fill the array with random numbers and summarize them all

public class Main {
  public static void main(String[] args) {
    
    int[] arr = new int[5];
    
    for (int i = 0; i < arr.length; i++){
    int randomNum = (int)(Math.random() * 101);
    arr[i] = randomNum;
    System.out.println(arr[i]);
    }

    int sum = null;

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
