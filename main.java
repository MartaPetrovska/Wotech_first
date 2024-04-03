public class Main {
  public static void main(String[] args) {
    var temperature = 35;
    
    if (temperature <= 5) {
    System.out.println("Wear super warm");
  }
    else if (temperature > 5 && temperature <= 15) {
      System.out.println("Wear warm");
    }

    else if (temperature > 15 && temperature <= 30) {
      System.out.println("Wear normal");
    }

    else if (temperature > 30) {
      System.out.println("Wear cooling");
    }
  }

}
