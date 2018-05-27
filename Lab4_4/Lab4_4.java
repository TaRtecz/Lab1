package lab4_4;

import java.util.concurrent.TimeUnit;

class MyUtil {
	private MyUtil()
	{
		throw new AssertionError();
	}
	public static long fib(int index)
	{
		if(index < 1) return 0;
		if(index == 1) return 1;
		return fib(index-2) + fib(index-1);
	}
}
public class Lab4_4 {
   public static void main(String[] args)
	{
		int fibIndex = 0;
		long startTime;
		do {
			startTime = System.nanoTime();
			System.out.println("Index: " + fibIndex + " Value: " + MyUtil.fib(fibIndex++));
		}while(System.nanoTime() - startTime < TimeUnit.SECONDS.toNanos(60));
		
		System.out.println("Начиная с позиции " + Integer.toString(fibIndex-2) + " вычисление числа Фибоначчи занимает более минуты");
	}   
}
