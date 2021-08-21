import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
   This program tests a map that maps names to colors.
*/
public class MapTester
{
   public static void main(String[] args)
   {      
      Map<String, Color> favoriteColors 
            = new HashMap<String, Color>();
      favoriteColors.put("Juliet", Color.pink);
      favoriteColors.put("Romeo", Color.green);
      favoriteColors.put("Adam", Color.blue);
      favoriteColors.put("Eve", Color.pink);

      Set<String> keySet = favoriteColors.keySet();
      for (String key : keySet)
      {
         Color value = favoriteColors.get(key);
         System.out.println(key + "->" + value);
      }
   }
}
