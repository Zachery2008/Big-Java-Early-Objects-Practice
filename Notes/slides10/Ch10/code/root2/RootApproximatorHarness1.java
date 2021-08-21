/**
   This program computes square roots of selected input values.
*/
public class RootApproximatorHarness1
{  
   public static void main(String[] args)
   {  
      double[] testInputs = { 100, 4, 2, 1, 0.25, 0.01 };
      for (double x : testInputs)
      {  
         RootApproximator r = new RootApproximator(x);
         double y = r.getRoot();
         System.out.println("square root of " + x
               + " = " + y);
      }
   }
}
