import java.util.ArrayList;

/**
   This program parses an XML file containing an item list.
   It prints out the items that are described in the XML file.
*/
public class ItemListParserTester
{
   public static void main(String[] args) throws Exception
   {
      ItemListParser parser = new ItemListParser();
      ArrayList<LineItem> items = parser.parse("items.xml");
      for (LineItem anItem : items)
         System.out.println(anItem.format());
   }
}
