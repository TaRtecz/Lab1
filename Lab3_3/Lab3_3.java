package lab3_3;

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
	static void randomFillArray(int[][] array, int lval, int rval)
	{
		for(int i = 0; i < array.length; ++i)
			for(int j = 0; j < array[i].length; ++j)
				array[i][j] = (int) Math.round(Math.random() * (rval-lval) + lval);
	}
	static void randomFillArray(int[] array, int lval, int rval)
	{
		for(int i = 0; i < array.length; ++i)
			array[i] = (int) Math.round(Math.random() * (rval-lval) + lval);
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
public class Lab3_3 {
    public static void main(String[] args)
	{
		System.out.println("Массив из случайных целых отрезка [0;9]:");

		int[] nums = new int[15];
		
		MyUtil.randomFillArray(nums, 0, 9);
		MyUtil.printArray(nums, " ");

		int[] evenOddCount = MyUtil.getEvenOddCount(nums);
		System.out.println("Четных элементов: " + evenOddCount[0]);
		System.out.println("Нечетных элементов: " + evenOddCount[1]);
	}
    
}
