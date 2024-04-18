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
