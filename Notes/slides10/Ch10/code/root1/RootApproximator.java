/**
   Computes approximations to the square root of
   a number, using Heron's algorithm.
*/
public class RootApproximator
{
   /**
      Constructs a root approximator for a given number.
      @param aNumber the number from which to extract the square root
      (Precondition: aNumber >= 0)
   */
   public RootApproximator(double aNumber)
   {
      a = aNumber;
      xold = 1;
      xnew = a;
   }

   /**
      Computes a better guess from the current guess.
      @return the next guess
   */
   public double nextGuess()
   {
      xold = xnew;
      if (xold != 0)
         xnew = (xold + a / xold) / 2;
      return xnew;
   }

   /**
      Computes the root by repeatedly improving the current
      guess until two successive guesses are approximately equal.
      @return the computed value for the square root
   */
   public double getRoot()
   {
      assert a >= 0;
      while (!Numeric.approxEqual(xnew, xold))
         nextGuess();
      return xnew;
   }
   
   private double a; // The number whose square root is computed
   private double xnew; // The current guess
   private double xold; // The old guess
}
