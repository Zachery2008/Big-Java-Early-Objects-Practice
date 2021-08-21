/**
   This program computes square roots of input values
   supplied by a loop.
*/
public class RootApproximatorHarness2
{  
   public static void main(String[] args)
   {  
      final double MIN = 1;
      final double MAX = 10;
      final double INCREMENT = 0.5;
      for (double x = MIN; x <= MAX; x = x + INCREMENT)
      {  
         RootApproximator r = new RootApproximator(x);
         double y = r.getRoot();
         System.out.println("square root of " + x
               + " = " + y);
      }
   }
}
