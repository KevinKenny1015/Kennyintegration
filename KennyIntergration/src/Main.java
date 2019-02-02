
//Kevin Kenny

import java.util.Scanner;


public class Main {
// A program integrating skills learned in COP 2006 like print outputs, and using primitive data types such as int,double, and string.
	public static void main(String[] args) {
		
	System.out.println("Welcome to the intergration project of Kevin Kenny!");
		
	
        int int1 = 2;
        double double1 = 2.0;
        String string1 = "2";

        final int int2 = 2;
        double double2 = 2.0;
        String  string2 = "2";
        /* Print the sum of both integer variables on a new line. */
        System.out.println("The result of + with ints is " + (int1 + int2));
        /* Print the sum of the double variables on a new line. */
        System.out.println("The result of + with doubles is " + (double1 + double2));            
        /* Concatenate and print the String variables on a new line. */
        System.out.println("The result of + with Strings is " + (string1 + string2));
    }
}	
	
	Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        // Complete this line
        // Complete this line

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        // Complete this line
        // Complete this line
    }
}
		
// any time you go from numbers to strings clear out buffer  
//Variable- anything that can vary, and a variable must have a unique name. asigned with an = operator 
//Scope- determins the accesibility of these variables.

// this is a clock
class Clock {
	//fields
 private  int  angleOfHourHand;
 private  int  angleOfMinuteHand;


	// methods
  public void tellTime ()  {}
}

class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                System.out.println("* short");
            if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                System.out.println("* int");
            if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                System.out.println("* long");
            //This will output byte,short,int,or long deoending in the size of the number
                       
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}

public class Solution {

    public static void main(String[] args) {
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
}
