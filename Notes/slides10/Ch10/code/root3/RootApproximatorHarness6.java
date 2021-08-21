import java.util.Random;

/**
   This program verifies the computation of square root values
   by using an oracle.
*/
public class RootApproximatorHarness6
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

         double oracleValue = Math.pow(x, 0.5); 

         // Check that test value approximately equals oracle value

         if (Numeric.approxEqual(y, oracleValue))
         {
            System.out.print("Test passed: ");
            passcount++;
         }
         else
         {
            System.out.print("Test failed: ");
            failcount++;
         }
         System.out.println("square root = " + y 
               + ", oracle = " + oracleValue);
      }
      System.out.println("Pass: " + passcount);
      System.out.println("Fail: " + failcount);
   }
}
