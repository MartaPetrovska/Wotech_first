// Multiplication table

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
              for (int j = 0; j < row.length; j++) {
                row[j] = i*j;
              }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
              if (array[i][j] < 10) {
                System.out.print(array[i][j] + "  ");
              } else {
                System.out.print(array[i][j] + " ");
              }
            }
          System.out.println();
        }
    }
}



// Fill the 5x5 array with numbers from 1 to 25
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int startingValue = 0;

        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
              for (int j = 0; j < row.length; j++) {
                row[j] = startingValue + 1;
                startingValue ++;
              }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
              if (array[i][j] < 10){
                System.out.print(" " + array[i][j] + " ");
              } else {
                System.out.print(array[i][j] + " ");
              }
            }
          System.out.println();
        }
    }
}


//Fill the array with random digits from 0 to 9
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
              for (int j = 0; j < row.length; j++) {
                row[j] = (int)(Math.random() * 101);
              }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
              if (array[i][j] < 10){
                System.out.print(" " + array[i][j] + " ");
              } else {
                System.out.print(array[i][j] + " ");
              }
            }
          System.out.println();
        }
    }
}


//Fill up the every second row/column with a number 1 (2 ways)
//1st with two loops

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

      // for loop to add 1 to every 2nd column
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j += 2) {
          array[i][j] = 1;
        }
      }
      
      // for loop to add 1 to every 2nd row
      for (int i = 0; i < array.length; i += 2) {
        for (int j = 0; j < array[i].length; j++) {
          array[i][j] = 1;
        }
      }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
              if (array[i][j] < 10){
                System.out.print(" " + array[i][j] + " ");
              } else {
                System.out.print(array[i][j] + " ");
              }
            }
          System.out.println();
        }
    }
}


//2nd with modulus

public class Main {
  public static void main(String[] args) {


    int[][] array = new int[5][5];

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if (j%2 == 0 || i%2 == 0) {
                array[i][j] = 1;
            } else {
                array[i][j] = 0;
            }
        }
    }

    for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
          if (array[i][j] < 10){
            System.out.print(" " + array[i][j] + " ");
          } else {
            System.out.print(array[i][j] + " ");
          }
        }
      System.out.println();
    }

  }
}




