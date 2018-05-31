/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_1;

class MyUtil {
	private MyUtil()
	{
		throw new AssertionError();
	}

	static void printClassName(Object obj)
	{
		System.out.println("Class name: " + obj.getClass().getSimpleName());
	}
	
	static void print(int data)
	{
		System.out.printf("Тип: int\n%d\n", data);
	}
	static void print(String data)
	{
		System.out.printf("Тип: string\n%s\n", data);
	}
	static void print(long data)
	{
		System.out.printf("Тип: long\n%d\n", data);
	}
	static void print(float data)
	{
		System.out.printf("Тип: float\n%f\n", data);
	}
	static void print(double data)
	{
		System.out.printf("Тип: double\n%f\n", data);
	}

	static int min(int a, int b)
	{
		return (a<b)?a:b;
	}
	static long min(long a, long b)
	{
		return (a<b)?a:b;
	}
	static double min(double a, double b)
	{
		return (a<b)?a:b;
	}

	static int max(int a, int b)
	{
		return (a>b)?a:b;
	}
	static long max(long a, long b)
	{
		return (a>b)?a:b;
	}
	static double max(double a, double b)
	{
		return (a>b)?a:b;
	}
}

class Cow {
	public void getName()
	{
		 System.out.println("Я корова");
	}
}
class Whale extends Cow{
	public void getName()
	{
		System.out.println("Я не корова, я кит");
	}
}

class Cat {
	public Cat getChild()
	{
		System.out.println("Cat is borned");
		return new Cat();
	}
}
class Bird {
}
class Lamp {
}
class Dog extends Cat {
    
	public Dog getChild() 
	{
		System.out.println("Dog is borned");
		return new Dog();
	}
}

class Main {
	public static void main(String[] args)
	{
		Cow cow = new Whale(); cow.getName(); 
  System.out.println("\n");
		Cat cat = new Cat(); cat.getChild();
		Dog dog = new Dog(); dog.getChild();
  System.out.println("\n");
		MyUtil.printClassName(cat);
		MyUtil.printClassName(dog);
  System.out.println("\n");
		MyUtil.print(MyUtil.max(1,2));	
		MyUtil.print(MyUtil.max(1l,2l));
		MyUtil.print(MyUtil.max(1d,2d));
  System.out.println("\n");
		MyUtil.print(MyUtil.min(1,2));	
		MyUtil.print(MyUtil.min(1l,2l));
		MyUtil.print(MyUtil.min(1d,2d));
	}
}