
package lab2_2;

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
	
	
}


public class Lab2_2 {

    public static void main(String[] args)
	{
		System.out.print("Введите m и n для построения прямоугольника: ");

		int row = MyUtil.getInt(), col = MyUtil.getInt();

		for(int i = 0; i < row; ++i) {
			for(int j = 0; j < col; ++j)
				System.out.print("8");
			System.out.println();
		}
	}
}
