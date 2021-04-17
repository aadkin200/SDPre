import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int myNum;

    System.out.println("Please enter a number:");
    myNum = input.nextInt();

    if (myNum % 2 == 0) {
      System.out.println("The number is even");
    } else if (myNum % 2 == 1) {
      System.out.println("The number is odd");
    } else {
      System.out.println("Invalid input");
    }
  }
}
