/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Scanner;

class MyUtil {
	private MyUtil()
	{
		throw new AssertionError();
	}
	
	public static Scanner sc = new Scanner(System.in);

	public static String getIn(String help, String ptrn, String invalid)
	{
		System.out.println(help);

		while (!sc.hasNext(ptrn)){
			sc.next();
			System.out.println(invalid);
		}
		return sc.next();
	}
}
//zadanie1
class Horse {
	protected String name;

	public Horse()
	{
		name = MyUtil.getIn(
				"Имя лошади: ",
				"\\w{3,}", 
				"Invalid name! Try again...");
	}
}
class Pegas extends Horse {
	
	public void fly()
	{
		System.out.println("Я верь эта  " + name + " лошадка умеет летать...");
	}
}
class lab6 {
	public static void main(String[] args)
	{
		Pegas p = new Pegas();
		p.fly();
	}
}
