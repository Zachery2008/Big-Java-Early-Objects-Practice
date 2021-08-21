import java.util.Scanner;

/**
   This program computes square roots of inputs supplied
   through System.in.
*/
public class RootApproximatorHarness4
{  
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      boolean done = false;
      while (in.hasNextDouble())
      {  
         double x = in.nextDouble();
         RootApproximator r = new RootApproximator(x);
         double y = r.getRoot();
         
         System.out.println("square root of " + x
               + " = " + y);
      }
   }
}
