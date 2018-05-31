/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_2;
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
//Zadanie2 i 4
class Pet {
	protected int age, weight;
	protected boolean isMale;

	public Pet() 
	{
		age = Integer.parseInt(MyUtil.getIn(
				"Возраст питомца: ",
				"\\d+",
				"Invalid age! Try again..."));

		weight = Integer.parseInt(MyUtil.getIn(
				"Вес питомца: ",
				"\\d+",
				"Invalid wight! Try again..."));

		String isMaleKey = "y";
		String isMaleAns = MyUtil.getIn(
				"Пол питомца(по умолчанию М)? ("+ isMaleKey +" если М): ",
				"\\w+",
				"Invalid male! Try again...");
		isMale = (isMaleAns.equals(isMaleKey)) ? true : false;
	}
}
class Cat extends Pet {	
	private String name;	
	public void changeName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public String getInfo()
	{
		String maleAns = (isMale) ? "М" : "Ж";
		return 
		"Кот " + name + " это питомец."
		+ "Его возраст " + age + " и " + weight + " его вес."
		+ "Так же он " + maleAns + ".";
	}
}
class Dog extends Pet {
		
	public String name;	
	
	public String getInfo()
	{
		String maleAns = (isMale) ? "М" : "Ж";
		return 
		"Собака " + name + " это питомец."
		+ " Его возраст " + age + " и " + weight + " его вес."
		+ " так же он " + maleAns + ".";
	}
}
class lab6_2 {
	public static void main(String[] args)
	{
		Cat cat = new Cat();
		cat.changeName(MyUtil.getIn(
			"Имя кота: ",
			"\\w{3,}", 
			"Invalid name! Try again..."));
		System.out.println(cat.getInfo());

		Dog dog = new Dog();
		dog.name = MyUtil.getIn(
			"Имя собаки: ",
			"\\w{3,}", 
			"Invalid name! Try again...");
		System.out.println(dog.getInfo());
	}
}

