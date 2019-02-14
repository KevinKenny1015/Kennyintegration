import java.util.Scanner;

// Kevin Kenny
public class Main {
  // A program integrating skills learned in COP 2006 like print outputs, and using primitive data
  // types such as int,double, and string.
  // this is the driver class
  public static void main(String[] args) {

    Truck myCar = new Truck();
    Truck kit = new Truck();
    Truck mysteryMachine = new Truck();

    myCar.setColor("black");
    System.out.println(myCar.getColor());


    System.out.println("Welcome to the intergration project of Kevin Kenny!");


    int int1 = 2;
    double double1 = 2.0;
    String string1 = "2";

    int int2 = 2;
    double double2 = 2.0;
    String string2 = "2";
    /* Print the sum of both integer variables on a new line. */
    System.out.println("The result of + with ints is " + (int1 + int2));
    /* Print the sum of the double variables on a new line. */
    System.out.println("The result of + with doubles is " + (double1 + double2));
    /* Concatenate and print the String variables on a new line. */
    System.out.println("The result of + with Strings is " + (string1 + string2));
    dataType();
    ifStatements();
  }

  public static void dataType() {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();

    // Write your code here.
    double d = scan.nextDouble();
    scan.nextLine();
    String s = scan.nextLine();
    scan.close();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }

  // any time you go from numbers to strings clear out buffer

  /*
   * this is a clock class Clock { //fields private int angleOfHourHand; private int
   * angleOfMinuteHand; // methods public void tellTime () {} }
   */

  public static void ifStatements() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {

      try {
        long x = sc.nextLong();
        System.out.println(x + " can be fitted in:");
        if (x >= -128 && x <= 127)
          System.out.println("* byte");
        if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
          System.out.println("* short");
        if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
          System.out.println("* int");
        if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
          System.out.println("* long");
        // This will output byte,short,int,or long deoending in the size of the number

      } catch (Exception e) {
        System.out.println(sc.next() + " can't be fitted anywhere.");
      }
    }
  }
}



/*
 * double num1 = 5; // this is a call, in the parenthesis is an argument double squared =
 * squareIt(num1, "Hello");
 * 
 * public static double squareIt(double n1) { return n1 *n1;
 * 
 * } }
 */

// Test for commit and push


    public static void myCard() {
      Card myCard = new Card();
      myCard.setSuite("Clubs");
      System.out.println(myCard.getSuite());
      myCard.draw();
      System.out.println(myCard.getSuite());
      }
    }
