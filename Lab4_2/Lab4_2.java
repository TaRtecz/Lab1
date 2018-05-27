package lab4_2;

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
public class Lab4_2 {
        public static void main(String[] args)
	{
		int a = 0, b = 20;
		System.out.println("5 массивов из 10 случайных целых элементов отрезка [" + a + ";" + b + "]:");
		 
		for(int i = 0; i < 5; ++i) {
			int[] randNums = new int[10];
			for(int j = 0; j < randNums.length; ++j)
				randNums[j] = MyUtil.getRandom(a, b);
			MyUtil.printArray(randNums);
		}
	}  
}
