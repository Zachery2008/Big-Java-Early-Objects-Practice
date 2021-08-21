import java.util.Random;

/**
   This program verifies the computation of square root values
   by checking a mathematical property of square roots.
*/
public class RootApproximatorHarness5
{  
   public static void main(String[] args)
   {  
      final double SAMPLES = 100;
      int passcount = 0;
      int failcount = 0;
      Random generator = new Random();
      for (int i = 1; i <= SAMPLES; i++)
      {  
         // Generate random test value

         double x = 1000 * generator.nextDouble();
         RootApproximator r = new RootApproximator(x);
         double y = r.getRoot();

         // Check that test value fulfills square property

         if (Numeric.approxEqual(y * y, x))
         {
            System.out.print("Test passed: ");
            passcount++;
         }
         else
         {
            System.out.print("Test failed: ");
            failcount++;
         }

         System.out.println("x = " + x
               + ", root squared = " + y * y);
      }
      System.out.println("Pass: " + passcount);
      System.out.println("Fail: " + failcount);
   }
}
