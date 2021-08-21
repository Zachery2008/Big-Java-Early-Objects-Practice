import java.util.ArrayList;

/**
   This class generates permutations of a word.
*/
public class PermutationGenerator
{
   /**
      Constructs a permutation generator.
      @param aWord the word to permute
   */
   public PermutationGenerator(String aWord)
   {
      word = aWord;
   }

   /**
      Gets all permutations of a given word.
   */
   public ArrayList<String> getPermutations()
   {
      ArrayList<String> result = new ArrayList<String>();

      // The empty string has a single permutation: itself
      if (word.length() == 0) 
      { 
         result.add(word); 
         return result; 
      }

      // Loop through all character positions
      for (int i = 0; i < word.length(); i++)
      {
         // Form a simpler word by removing the ith character
         String shorterWord = word.substring(0, i)
               + word.substring(i + 1);

         // Generate all permutations of the simpler word
         PermutationGenerator shorterPermutationGenerator 
               = new PermutationGenerator(shorterWord);
         ArrayList<String> shorterWordPermutations 
               = shorterPermutationGenerator.getPermutations();

         // Add the removed character to the front of
         // each permutation of the simpler word, 
         for (String s : shorterWordPermutations)
         {
            result.add(word.charAt(i) + s);
         }
      }
      // Return all permutations
      return result;
   }

   private String word;
}
