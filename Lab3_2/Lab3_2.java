package lab3_2;

class MyUtil {
	private MyUtil()
	{
		throw new AssertionError();
	}
        static int[] getEvenOddCount(int start, int end)
	{
		int evenCount = 0;
		int oddCount = 0;

		for(int i = start; i <= end; ++i) {
			if( i % 2 == 0) ++evenCount;
			else ++oddCount;
		}
		return new int[]{evenCount, oddCount};
	}
	static int[] getEvenOddCount(int[] array)
	{
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i = 0; i < array.length; ++i) {
			if(array[i]/* % 10)*/ % 2 == 0) ++evenCount;
			else ++oddCount;
		}
		return new int[]{evenCount, oddCount};
	}
	static void printArray(int[][] array)
	{
		for(int i = 0; i < array.length; ++i) {
			for(int j = 0; j < array[i].length; ++j) {
				System.out.print(Integer.toString(array[i][j]) + "\t");
			}
			System.out.println();
		}
	}
	static void printArray(int[] array, String spliter)
	{
		for(int i = 0; i < array.length; ++i)
			System.out.print(Integer.toString(array[i]) + spliter);
		System.out.println();
	}
}
public class Lab3_2 {
    public static void main(String[] args)
	{
		System.out.println("Массив из чисел от 1 до 99 в прямом и обратном порядке:");

		//init
		int start = 1, end = 99;
		int oddCount = MyUtil.getEvenOddCount(start, end)[1];
		int[] nums = new int[oddCount];

		//fill
		for(int i = start, j = 0; i <= end; ++i)
			if( (i % 10) % 2 != 0 )
				nums[j++] = i;
		
		//output
		MyUtil.printArray(nums, " ");
		for(int i = nums.length - 1; i >= 0; --i)
			System.out.print(Integer.toString(nums[i]) + " ");
		System.out.println();	
	}   
}
