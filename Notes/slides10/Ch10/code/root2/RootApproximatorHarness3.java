import java.util.Random;

/**
   This program computes square roots of random inputs.
*/
public class RootApproximatorHarness3
{  
   public static void main(String[] args)
   {  
      final double SAMPLES = 100;
      Random generator = new Random();
      for (int i = 1; i <= SAMPLES; i++)
      {  
         // Generate random test value

         double x = 1000 * generator.nextDouble();
         RootApproximator r = new RootApproximator(x);
         double y = r.getRoot();
         System.out.println("square root of " + x
               + " = " + y);
      }
   }
}
