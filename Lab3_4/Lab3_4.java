package lab3_4;

class MyUtil {
	private MyUtil()
	{
		throw new AssertionError();
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
public class Lab3_4 {
    public static void main(String[] args)
	{
		System.out.println("Двумерный массив 8x5 из случайных целых отрезка [10;99]:");
		int row = 8, col = 5;
		int[][] nums = new int[row][col];
		MyUtil.randomFillArray(nums, 10, 99);
		MyUtil.printArray(nums);
	}   
}
