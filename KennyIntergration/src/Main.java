
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


// Intigration Project
// This is the header.
/**
 * The Main class contains my code hope you enjoy it.
 * 
 * @author Kevin
 *
 */
public class Main {
  // A program integrating skills learned in COP 2006 like print outputs, and
  // using primitive data types such as int,double, and string.
  // this is the driver class
  // test change
  // any time you go from numbers to strings clear out buffer
  // Variable- anything that can vary, and a variable must have a
  // unique name.asigned with an = operator
  // Scope- determines the accessibility of these variables.

  /**
   * Adds int, double, and string and it will output them.
   * 
   * @param args Intro to my Integration project.
   */
  public static void main(String[] args) {

    System.out.println("Welcome to my intergration project!");
    System.out.println("Test for the comit to intergration repository");

    int int1 = 2;
    double double1 = 2.0;
    String string1 = "2";

    int int2 = 2;
    double double2 = 2.0;
    String string2 = "2";
    /* Print the sum of both integer variables on a new line. */
    System.out.println("The result of two ints is " + (int1 + int2));
    /* Print the sum of the double variables on a new line. */
    System.out.println("The result of two doubles is " + (double1 + double2));
    /* Concatenate and print the String variables on a new line. */
    System.out.println("The result of two Strings is " + (string1 + string2));

    final Scanner scan = new Scanner(System.in);
    makeTruck();
    testHuman();
    runScore();
    twoDArray();
    arLoop();
    golfScore();
    getMinValue();
    twoDArray();
    showSportsList();
    exceptionCatch(scan);
    findIndex();
    countContinue();
    duckCount();
    printCount();
    dataType(scan);
    ifStatements(scan);
    myCard();
    launchPlan();
    areaCalc();
    randomNumgen();
    numberTeller(scan);
    gradeScorer(scan);
    numberSwitch();
    numValue();
    valueEval();
    stringFormat(scan);
    countDown();
    numberBreak();

  }

  /**
   * Type and int, double, and string below.
   * 
   * @param scan looking for user input
   */
  public static void dataType(Scanner scan) {

    System.out.println("Type an int");
    int i = scan.nextInt();
    System.out.println("Int: " + i);
    System.out.println("Type a double");
    double d = scan.nextDouble();
    System.out.println("Double: " + d);
    scan.nextLine();
    System.out.println("Type a String");
    String s = scan.nextLine();
    System.out.println("String: " + s);
  }

  // any time you go from numbers to strings clear out buffer

  /**
   * This will output what size the numbers can fit in.
   * 
   * @param sc looking for user input to see wher the number fits
   */
  public static void ifStatements(Scanner sc) {

    System.out.println("type two numbers and see what data type they fit in!");

    for (int i = 0; i < 2; i++) {

      try {
        long x = sc.nextLong();
        System.out.println(x + " can be fitted in:");
        if (x >= -128 && x <= 127) {
          System.out.println("* byte");
        }
        if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) {
          System.out.println("* short");
        }
        if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
          System.out.println("* int");
        }
        if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
          System.out.println("* long");
        }
        // This will output byte,short,int,or long deoending in the size
        // of the number

      } catch (Exception e) {
        System.out.println(sc.next() + " can't be fitted anywhere.");
        System.out.println("================================");
      }
    }
  }

  /*
   * double num1 = 5; // this is a call, in the parenthesis is an argument
   * double squared =.
   * 
   * public static double squareIt(double n1) { return n1 *n1;
   * 
   * } }
   */

  // Test for commit and push

  /**
   * Produce 2 random card suits.
   */
  public static void myCard() {
    Card myCard = new Card();
    myCard.draw();
    System.out.println("2 randon card suits will print");
    System.out.println(myCard.getSuit()); // Print randon card suit
    System.out.println(myCard.getSuit());
    System.out.println("================================");
  }

  /**
   * This code is a rocket count down.
   */
  public static void launchPlan() {
    System.out.println("Run rocket will kill you if you are to close!");
    System.out.println("Countdown to Launch");// this is an argument

    for (int t = 10; t >= 0; t--) {
      System.out.println(t);
    }
    System.out.println("Take Off");
    System.out.println("================================");
  }

  /**
   * Both of the length and width are given so, it will output the area.
   */
  public static void areaCalc() {
    double length = 5.0;
    double width = 2.5; // The area will be calculated
    System.out.println(calculateArea(length, width));
    System.out.println("================================");
  }

  /**
   * Will return the area.
   * 
   * @param side1 Length of rectangle
   * @param side2 Width of rectangle
   * @return an integer value for the area.
   */
  public static double calculateArea(double side1, double side2) {
    System.out.println("Show the area of the rectangle: ");
    double area;
    area = side1 * side2;
    return area;// will output length*width
  }

  /**
   * 6 random numbers from 1-53 will print.
   */
  public static void randomNumgen() {
    // create random object
    System.out.println("6 random numbers between (1-53) will print out:");
    Random randomGen = new Random();
    // will output a random number 1-53, 6 times. A number may be the same.
    System.out.println(randomGen.nextInt(53) + 1);
    System.out.println(randomGen.nextInt(53) + 1);
    System.out.println(randomGen.nextInt(53) + 1);
    System.out.println(randomGen.nextInt(53) + 1);
    System.out.println(randomGen.nextInt(53) + 1);
    System.out.println(randomGen.nextInt(53) + 1);
    System.out.println("================================");
  }

  /**
   * Input size of your pizza slice. It will output the bigger number
   * between pi and the pizza size.
   * @param scan lokking for a user to input their number.
   */
  public static void numberTeller(Scanner scan) {

    System.out.println("Tell me the size of your slice and I will tell");
    System.out.println("you which is larger, the number entered, or PI");
    double slice = scan.nextDouble();// looking for a number as a double.
    // output the larger value, slice or PI
    System.out.println(Math.max(slice, Math.PI));
    System.out.println("================================");
  }

  /**
   * Input your grade and it will tell you letter grade for your score.
   * 
   * @param scan Input for the grade from user.
   */
  public static void gradeScorer(Scanner scan) {
    System.out.println("input your test score");
    double testscore = scan.nextDouble();
    char grade;

    if (testscore >= 90) {
      grade = 'A';
    } else if (testscore >= 80) {
      grade = 'B';
    } else if (testscore >= 70) {
      grade = 'C';
    } else if (testscore >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println("You got a letter grade of: " + grade);
    System.out.println("================================");
  }

  /**
   * This code is a Case and Break set of code.
   */
  // https://www.geeksforgeeks.org/switch-statement-in-java/
  public static void numberSwitch() {
    int num = 2;
    switch (num + 2) {
      case 1: {
        System.out.println("Case1: Value is: " + num);
        break;
      }
      case 2: {
        System.out.println("Case2: Value is: " + num);
        break;
      }
      case 3: {
        System.out.println("Case3: Value is: " + num);
        break;
      }
      default: {
        System.out.println("Default: Value is: " + num);
        System.out.println("================================");
        break;
      }
    }
  }

  /**
   * The code below will output all the operation possibilities.
   */
  public static void numValue() {
    int value1 = 1;
    int value2 = 2;
    if (value1 == value2) { // equal
      System.out.println("value1 == value2");
    }
    if (value1 != value2) { // not equal to
      System.out.println("value1 != value2");
    }
    if (value1 > value2) { // greater than
      System.out.println("value1 > value2");
    }
    if (value1 < value2) { // less then
      System.out.println("value1 < value2");
    }
    if (value1 <= value2) { // less then equal to
      System.out.println("value1 <= value2");
      System.out.println("================================");
    }
  }

  /**
   * This code used Java AND and OR.
   */
  public static void valueEval() {
    int valuenumber1 = 1;
    int value2 = 2;
    if ((valuenumber1 == 1) && (value2 == 2)) {
      // if both values are true
      // print line bellow.
      System.out.println("value1 is 1 AND value2 is 2");
    }
    if ((valuenumber1 == 1) || (value2 == 1)) {
      // if one of the values is true
      // print line.
      System.out.println("value1 is 1 OR value2 is 1");
      System.out.println("================================");
    }
  }

  /**
   * This code allows this to print out whitespace. Also placed where I want it.
   * 
   * @param sc numbers of 3 digits with 15 white spaces
   */
  public static void stringFormat(Scanner sc) {
    System.out.println("================================");
    for (int i = 0; i < 3; i++) {
      String s1 = sc.next();
      int x = sc.nextInt();
      // Complete this line
      System.out.format("%-14s %03d %n", s1, x);
    } // total of 15 white spaces,numbers will have 3 digits
    System.out.println("================================");
  }

  /**
   * Basic Counter from 5 down.
   */
  public static void countDown() {
    int i = 5;
    while (i > 1) {
      System.out.println(i);
      i--;
    }
  }

  /**
   * Counts the total number of ducks.
   */
  public static void duckCount() {
    for (int i = 10; i > 1; i--) {
      System.out.println("The total number of ducks are: " + i);
    }
  }

  /**
   * This code will output x as long as it is less then 10.
   */
  public static void printCount() {
    int x = 0;
    do {
      System.out.println("The number is: " + x);
      x++;
    } while (x < 10);
  }

  /**
   * If i is more then 4 and less then 9 it will skip the continue statement.
   */
  public static void countContinue() {

    for (int i = 1; i <= 10; ++i) {
      if (i > 4 && i < 9) {
        continue; /*
                   * continue statement skips the statements after the continue
                   *  statement and keeps looping.
                   */
      }
      System.out.println(i);
    }
  }

  /**
   * Code will go through the number from 100 down til it hits 99 
   * then it go to the break.
   */
  public static void numberBreak() {
    int var;
    for (var = 100; var >= 10; var--) {
      System.out.println("the variable is: " + var);
      if (var == 99) {
        break; /*
                * the loop is ended right away and the program resumes
                * at the following statement in the loop.
                */
      }
    }
    System.out.println("Out of for-loop!");
  }

  /*
   * the operator precedence works just like pemdas.
   * Multiplication and divide have a higherprecedence than add and subtract.
   * Precedence rules can be overridden by explicit parentheses.
   
   * what is a constructor - A method that gets called automaticly when
   * objects created.
    
   * overloading-different signerature(number,data type) 
   * over-riding having two or more methods with the same name in
   * a base and in a derive class.
   * polymorphism- ("is a")one thing is allowed to be something else, a 
   * derived type can be stored in a container declared as the base type
   * inheriting-taking the properties a a subclass and 
   * allowing the superclass to take over.
   */
  /**
   * This code totals the number of runs and outputs the sum.
   */
  public static void runScore() {
    int[] runs = {3, 1, 1, 0, 0, 0, 2, 1, 0};
    int sum = 0;
    // sum with accumulator
    for (int counter = 0; counter < runs.length; counter++) {
      sum += runs[counter];
    }
    System.out.println("The total runs are: " + sum);
  }

  /**
   * This will print the minimum value in the array.
   */
  public static void getMinValue() {
    int[] numbers = {0, 1, 2, 3, 4, 5};// numbers in array
    int minValue = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < minValue) {
        minValue = numbers[i];
      }
    }
    System.out.println("The minimum value is: " + minValue);// output min value
  }


  /**
   * The vowels in the array will print out on screen.
   */
  public static void arLoop() {

    char[] vowels = {'a', 'e', 'i', 'o', 'u'};// array

    for (int i = 0; i < vowels.length; ++i) {
      System.out.println(vowels[i]);
    }
  }

  /**
   * This code keeps track of your golf score. It totals the numbers
   * in the array and print the total score.
   */
  // https://www.javatpoint.com/array-in-java
  public static void golfScore() {
    int[] anArray;// declares the array of integers
    anArray = new int[10];// opens memory for 10 integers
    anArray[0] = 3;// initialize the elements
    anArray[1] = 5;
    anArray[2] = 4;
    anArray[3] = 4;
    anArray[4] = 2;
    anArray[5] = 3;
    anArray[6] = 5;
    anArray[7] = 5;
    anArray[8] = 3;
    anArray[9] = 34;// used as total score for 9 hole golf match

    System.out.println("Hole 1 score: " + anArray[0]);
    System.out.println("Hole 2 score: " + anArray[1]);
    System.out.println("Hole 3 score: " + anArray[2]);
    System.out.println("Hole 4 score: " + anArray[3]);
    System.out.println("Hole 5 score: " + anArray[4]);
    System.out.println("Hole 6 score: " + anArray[5]);
    System.out.println("Hole 7 score: " + anArray[6]);
    System.out.println("Hole 8 score: " + anArray[7]);
    System.out.println("Hole 9 score: " + anArray[8]);
    System.out.println("total Par is 36 and you scored: " + anArray[9]);
    System.out.println("Great Match, your awesome!");
  }

  /**
   * Groups the arrays and prints them on the screen.
   */
  public static void twoDArray() {
    // 2D Array used here
    int[][] a = {{1, -2, 3}, {-4, -5, 6, 9}, {7},};// initialized Array

    for (int i = 0; i < a.length; ++i) {
      for (int j = 0; j < a[i].length; ++j) {
        System.out.println(a[i][j]);
      }
    }
  }

  /**
   * Outputs the string of arrays on order as below.
   */
  public static void showSportsList() {

    // create a ArrayList String type
    ArrayList<String> gfg = new ArrayList<String>();

    // Initialize an ArrayList with add()
    gfg.add("Baseball");
    gfg.add("Football");
    gfg.add("Golf");

    // print ArrayList
    System.out.println("My favorite sports are  : " + gfg);
  }

  /**
   * If you enter an int it will work but if not a friendly 
   * exception will pop up.
   * 
   * @param s an integer or something that will cause an exception.
   */
  // https://www.tutorialspoint.com/java/java_exceptions.htm
  public static void exceptionCatch(Scanner s) {
    // enter not an int 
    try {
      System.out.print("Enter an integer: ");
      int num = s.nextInt();
      System.out.println("You entered " + num);
    } catch (InputMismatchException e) {
      System.out.println("You have entered invalid data");
    }
  }



  // Function to find the index of an element in a primitive array in Java
  /**
   * Sorts through the code finding the arrays i called for and will 
   * print the array list i want printed on screen.
   */
  public static void findIndex() {
    System.out.println("Type of cars I want to own!");
    ArrayList<String> al = new ArrayList<String>();
    al.add("Ford");
    al.add("Dodge");
    al.add("Chevy");
    al.add("Jeep");
    al.add("Jaguar");
    al.add("McClaren");
    al.add("GMC");

    System.out.println("Index of 'Ford': " + al.indexOf("Ford"));
    System.out.println("Index of 'GMC': " + al.indexOf("GMC"));
    System.out.println("Index of 'McClaren': " + al.indexOf("McClaren"));
    System.out.println("Index of 'Chevy': " + al.indexOf("Chevy"));
  }


  /**
   * This code will go through Truck.java and will use the getcolor and
   *  getyear to output the color of year.
   */
  public static void makeTruck() {
    Truck myTruck = new Truck();
    myTruck.setColor("Black");
    System.out.println(myTruck.getColor());
    myTruck.setYear(2019);
    System.out.println(myTruck.getYear());

    Truck yourTruck = new Truck("Blue", 2018);
    System.out.println(yourTruck.getColor());
    System.out.println(yourTruck.getYear());

  }


  /**
   * This will be the call to activate the print statements for below.
   */
  public static void testHuman() {
    Student kevin = new Student();
    kevin.study();
    Human mom = new Human();
    mom.breath();
  }

}

