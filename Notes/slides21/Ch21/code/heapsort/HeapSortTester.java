/**
   This program tests the heapsort algorithm.
*/
public class HeapSortTester
{  
   public static void main(String[] args)
   {  
      int[] a = ArrayUtil.randomIntArray(20, 100);
      ArrayUtil.print(a);
      HeapSorter sorter = new HeapSorter(a);
      sorter.sort();
      ArrayUtil.print(a);
   }
}

