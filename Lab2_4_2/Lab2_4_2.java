
package lab2_4_2;

import java.util.Scanner;

class MyUtil {

	private MyUtil() 
	{
		throw new AssertionError();
	}

	static Scanner sc = new Scanner(System.in);

	static public int getInt()
	{
		while(!sc.hasNextInt()) {
			System.out.println("Invalid data!");
			sc.next();
		}
		return sc.nextInt();
	}
	
	static public int getMin(int r, int l)
	{
		return (l < r) ? l : r;
	}
	static public int getMin(int v1, int v2, int v3, int v4)
	{
		return getMin(getMin(getMin(v1, v2), v3), v4);
	}
}

public class Lab2_4_2 {

   public static void main(String[] args)
	{
		System.out.print("Введите 4 числа для вывода минимального: ");

		System.out.println("Минимальное число: " 
                                        		+ Integer.toString(MyUtil.getMin(	
										MyUtil.getInt(), 
										MyUtil.getInt(),
										MyUtil.getInt(),
										MyUtil.getInt())) );
	}
    
}
