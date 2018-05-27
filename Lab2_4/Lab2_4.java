/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_4;

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
	static public String getName()
	{
		boolean isValidName;// = true;
		String name;
		do {
			isValidName = true;
			name = sc.nextLine();
			if (name.matches("\\W")) {
				System.out.println("Invalid data!");
				isValidName = false;
			}
		} while (!isValidName);
		return name;
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
public class Lab2_4 {

public static void main(String[] args)
	{
		System.out.print("Введите 2 числа для вывода минимального: ");

		int r = MyUtil.getInt(), l = MyUtil.getInt();
		System.out.println(MyUtil.getMin(r,l));	
	}
    
}
