package lab4_1;

import java.util.concurrent.TimeUnit;
class MyUtil {
	private MyUtil()
	{
		throw new AssertionError();
	}

	public static int getRandom(int lval, int rval)
	{
		return (int) Math.round((Math.random() * (rval - lval) + lval ));
	}
	public static void printArray(int[] array)
	{
		for(int i = 0; i < array.length; ++i)
			System.out.print(Integer.toString(array[i]) + " ");
		System.out.println();
	}
}
public class Lab4_1 {
   public static void main(String[] args)
	{
		int a = 0, b = 20;
		System.out.println("Массив из 20 случайных целых отрезка [" + a + ";" + b + "]:");
		
		int[] randNums = new int[20];
		for(int i = 0; i < randNums.length; ++i)
			randNums[i] = MyUtil.getRandom(a, b);

		MyUtil.printArray(randNums);
	}   
}
