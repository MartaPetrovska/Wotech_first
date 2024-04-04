public class Main {
  public static void main(String[] args) {
    
    //I will be able to open the doors, if the first key is unlocked AND if the second key is unlocked.
    boolean key1 = true;
    boolean key2 = true;

    if (key1 && key2) {
    System.out.println("You can enter the room");
    } else {
    System.out.println("You can not enter the room");
    }

    //I will log you in if your username is correct AND if your password is correct.
    String username = "admin";
    String password = "password";
    boolean isLoggedIn = username == "admin" && password == "password";

    if (isLoggedIn) {
      System.out.println("You are logged in");
    } else {
      System.out.println("You are not logged in");
    }

    //I will buy eggs if they will be on the sale OR they will cost less than 2.50

    boolean sale = true;
    double price = 3;  

    if (sale || price < 2.50) {
      System.out.println("You can buy the eggs");
    } else {
      System.out.println("You can not buy the eggs");
    }

    //I will go running, if I will have enough energy OR if the weather is shiny.

    boolean energy = true;
    boolean shiny = true;

    if (energy || shiny) {
      System.out.println("You can go running");
    } else {
      System.out.println("You can not go running");
    }
  }
}
