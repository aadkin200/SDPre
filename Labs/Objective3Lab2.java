public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;
    side1 = 12;
    side2 = 16;
    hypotenuse = (side1 * side1) + (side2 * side2);
    hypotenuse = Math.sqrt(hypotenuse);
    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);

  }
}
