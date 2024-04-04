import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter name");
    String name = scan.nextLine();
    
    System.out.println("Enter distance in meters (whole number)");
    int distance = scan.nextInt();
    
    scan.nextLine(); //needed to delete newline character (which is interpreted as an empty line) left after integer

    System.out.println("Every day a girl named " + name + " went " + distance + " meters to see her favorite giraffe.");

    // this can also be written like this

    System.out.println("Every day a girl named " + scan.nextLine() + " went " + scan.nextInt() + " meters to see her favorite         giraffe.");

    scan.close();
  }

}
