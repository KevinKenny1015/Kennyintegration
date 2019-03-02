import java.util.Scanner;
import java.util.Random;

//Intigration Project.
// Kevin Kenny
// This is the header.
public class Main {
  // A program integrating skills learned in COP 2006 like print outputs, and using primitive data
  // types such as int,double, and string.
  // this is the driver class
  // test change
  
  //any time you go from numbers to strings clear out buffer  
  //Variable- anything that can vary, and a variable must have a unique name. asigned with an = operator 
  //Scope- determins the accesibility of these variables.
  
  public static void main(String[] args) {

    Truck myCar = new Truck();
    Truck kit = new Truck();
    Truck mysteryMachine = new Truck();

    myCar.setColor("black");
    System.out.println(myCar.getColor());


    System.out.println("Welcome to the intergration project of Kevin Kenny!");
    System.out.println("This is a test for the comit to intergration  repository");

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
    myCard();
   launchPlan();
   areaCalc();
   randomNumgen();
   numberTeller();
   gradeScorer();
   numberSwitch();
   numValue();
   valueEval();
   stringFormat();
   countDown();
   duckCount();
   printCount();
   countContinue();
   numberBreak();
   

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
      myCard.draw();
      System.out.println(myCard.getSuit());
      System.out.println(myCard.getSuit());
      }
 
        
      public static void launchPlan() {
        System.out.println("Countdown to Launch");// this is an argument 
        
        for(int t = 10; t >= 0; t--) {
          System.out.println(t);
        }
        System.out.println("Take Off");
        }
      
      public static void areaCalc() {
        double length = 5.0;
        double width = 2.5;
        System.out.println(calculateArea(length, width));
      }  
      
      public static double calculateArea(double side1, double side2) {
        double area;
        area = side1 * side2;
        return area;// will output length*width
      }
      
      public static void randomNumgen() {
        // create random object
        Random randomGen = new Random();
        // will output a random number 1-53, 6 times. A number may be the same. 
          System.out.println( randomGen.nextInt(53) + 1);
          System.out.println( randomGen.nextInt(53) + 1);
          System.out.println( randomGen.nextInt(53) + 1);
          System.out.println( randomGen.nextInt(53) + 1);
          System.out.println( randomGen.nextInt(53) + 1);
          System.out.println( randomGen.nextInt(53) + 1);
    }
      
      public static void numberTeller() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Tell me the size of your slice and I will tell"); 
        System.out.println("you which is larger, the number entered, or PI");
        double slice = scan.nextDouble();// looking for a number as a double.
        // output the larger value, slice or PI
        System.out.println(Math.max(slice,Math.PI));         
      }
          
      public static void gradeScorer() {

        int testscore = 76;
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
        System.out.println("Grade = " + grade);
    }
      
      public static void numberSwitch(){
        int num=2;
        switch(num+2)
        {
           case 1:
         System.out.println("Case1: Value is: "+num);
       case 2:
         System.out.println("Case2: Value is: "+num);
       case 3:
         System.out.println("Case3: Value is: "+num);
           default:
         System.out.println("Default: Value is: "+num);
         }
      }
      
      public static void numValue() {
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)//equal
            System.out.println("value1 == value2");
        if(value1 != value2)// not equal to
            System.out.println("value1 != value2");
        if(value1 > value2)// greater than
            System.out.println("value1 > value2");
        if(value1 < value2)// less then
            System.out.println("value1 < value2");
        if(value1 <= value2)//less then equal to 
            System.out.println("value1 <= value2");
    }
      
      public static void valueEval(){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))//if both values are true print line bellow.
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))//if one of the values is true print line.
            System.out.println("value1 is 1 OR value2 is 1");
    }
      
      public static void stringFormat() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.format("%-14s %03d %n", s1, x);
        }   // total of 15 white spaces,numbers will have 3 digits
        System.out.println("================================");
}
      
      public static void countDown() {
        int i=5;
        while(i>1){
             System.out.println(i);
             i--;
        }
}
      
      public static void duckCount() {
        for(int i=10; i>1; i--){
             System.out.println("The total ducks are: "+i);
        }
}
      public static void printCount() {
        int x = 0; 
        do { 
            System.out.println(x); 
            x++; 
        } while(x < 10);        
  }
      
      public static void countContinue() {
        
        for (int i = 1; i <= 10; ++i) {      
           if (i > 4 && i < 9) {
              continue; /*continue statement skips the statements
               after the continue statement and keeps looping.*/
           }      
           System.out.println(i);
        }   
     }
      
      public static void numberBreak(){
        int var;
        for (var =1000; var>=100; var --)
        {
            System.out.println("var: "+var);
            if (var==999)
            {
                 break; /* the loop is ended right away and the program resumes 
                 at the following statement in the loop*/
            }
         }
         System.out.println("Out of for-loop");
       }

/*the operator precedence works just like pemdas. multiplication and division have 
 a higher precedence than addition and subtraction. Precedence rules can be 
 overridden by explicit parentheses.*/
}     
      


    




   

        


