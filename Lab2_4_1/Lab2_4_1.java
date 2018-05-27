
package lab2_4_1;

import java.util.Scanner;

class MyUtil {

	private MyUtil() 
	{
		throw new AssertionError();
	}

	static Scanner sc = new Scanner(System.in);

	
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
	
}

public class Lab2_4_1 {

   public static void main(String[] args)
	{
		System.out.println("Введите 2 имени для проверки:");

		String firstName = MyUtil.getName(), secondName = MyUtil.getName();
		String resultMsg;

		if( firstName.equals(secondName) )
			resultMsg = "Имена идентичны.";
		else if ( firstName.length() == secondName.length() )
			resultMsg = "Длины имен равны.";
		else resultMsg = "Имена не совпадают.";

		System.out.println(resultMsg);
	}
    
}
