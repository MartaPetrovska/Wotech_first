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
