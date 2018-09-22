import java.util.Random;
import java.util.Scanner;

public class ArrayMethodsSetEvenTo0Tester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.print("Enter Array Length: ");
		int arrayLength = in.nextInt();
		
		in.close();
		
		int[] nums = new int[arrayLength];
		
		for(int i = 0; i < arrayLength; i++)
		{
			int randNum = generator.nextInt(49) + 1;
			nums[i] = randNum;
		}
		
		ArrayMethods array = new ArrayMethods(nums);
		System.out.println("This Array: ");
		array.printArray();
		
		System.out.println("Array after replacing even with 0: ");
		array.setEvenTo0();
		array.printArray();
	}

}
