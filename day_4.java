// CLASSES AND PUBLIC STATIC VOID

public class Main {

  static int sharedValue = 200; // MAIN class uses only STATIC values

  public static void main(String[] args) {
    int mainValue = 14;
    System.out.println(mainValue);
    firstMethod();
    // secondMethod();
  }

  public static void firstMethod() {
    int firstValue = 20;
    System.out.println(firstValue);
    secondMethod();
  }

  public static void secondMethod() {
    int secondValue = 30;
    System.out.println(secondValue);
    System.out.println(sharedValue);
    
  }
  

}
