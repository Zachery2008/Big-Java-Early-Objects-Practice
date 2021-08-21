import java.util.ArrayList;

/**
   This program tests the permutation generator.
*/
public class PermutationGeneratorTester
{
   public static void main(String[] args)
   {
      PermutationGenerator generator 
            = new PermutationGenerator("eat");
      ArrayList<String> permutations = generator.getPermutations();
      for (String s : permutations)
      {         
         System.out.println(s);
      }
   }
}

