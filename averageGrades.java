import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] student1 = addGrades();
    int[] student2 = addGrades();
    int[] student3 = addGrades();
    System.out.println ("Average value for grades of student1 is " + average(student1));
      System.out.println ("Average value for grades of student2 is " + average(student2));
    System.out.println ("Average value for grades of student3 is " + average(student3));
  }

  public static double average(int[] grades) {
    double arraySum = 0;
    for (int i = 0; i < grades.length; i++) {
    arraySum += grades[i];
    }
    return arraySum/grades.length;
  }

  public static int[] addGrades() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Add student grades: ");
    int grades[] = new int[10];
    for (int i = 0; i < grades.length; i++) {
      grades[i] = scanner.nextInt();
    }
    return grades;
  }
  
}
