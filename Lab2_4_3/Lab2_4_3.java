
package lab2_4_3;

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
class Point {
	public Point(int _x, int _y)
	{
		x = _x;
		y = _y;
	}
	public int x, y;
	public int getQuarter() 
	{
		if(x == 0 || y == 0) return 0;	
		if(x > 0) {
			if(y>0) return 1; 
			else return 4;
		} 
		if(y>0) return 2;
		else return 3;
	}
}
public class Lab2_4_3 {

    public static void main(String[] args)
	{
		System.out.print("Введите координаты точки, не лежащей на координатных осях: ");

		Point pnt = new Point(MyUtil.getInt(), MyUtil.getInt());
		int quarter = pnt.getQuarter();
		String outputMsg;
		if(quarter == 0) outputMsg = "Точка лежит на координатной оси.";
		else outputMsg = "Четверть точки: " + Integer.toString(quarter);

		System.out.println(outputMsg);
	}
   
}
