/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class MyUtil {
	private MyUtil()
	{
		throw new AssertionError();
	}

	static public <T1> void fillLine(Collection<T1> c, T1[] array)
	{
		for(T1 element : array)
			c.add(element);
	}
	static public <T1, T2> void fillMap(Map<T1, T2> map, T1[] keys, T2[] values)
	{
		if(keys.length != values.length) return;
		for(int i = 0; i < keys.length; ++i)
			map.put(keys[i], values[i]);
	}
}

class Cat {
	public Cat(String name) { this.name = name; }
	public String name;
}

class Lab8 {
	public static void main(String[] args)
	{

//------  1 ------

		System.out.println("№1\n");

		String[] keys = {
			"Арбуз",
			"Банан",
			"Вишня",
			"Груша",
			"Дыня",
			"Ежевика",
			"Жень-шень",
			"Ежевика",
			"Ирис",
			"Кортофель"};
		String[] values = {
			"Ягода",
			"Трава",
			"Ягода",
			"Фрукт",
			"Овощ",
			"Куст",
			"Корень",
			"Ягода",
			"Цветок",
			"Клубень"};

		Set<String> set = new HashSet<String>(10);
		MyUtil.fillLine(set, keys);
		
		for(String element : set)
			System.out.println(element);
		
//------  2 ------

		System.out.println("\n№2\n");

		Map<String, String> map = new HashMap<String, String>(10);
		MyUtil.fillMap(map, keys, values);

		//Java
		for(	Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
				it.hasNext();) {
			Map.Entry<String, String> pair = it.next();
			System.out.printf("%s - %s\n", pair.getKey(), pair.getValue());
		}
		//C++
		//for(auto it=_map.begin(); it!=_map.end(); ++it)
		//	printf("%s - %s\n", it->first, it->second);

//------ 3 ------

		System.out.println("\n№3\n");			

		String[] catNames = { 
			"Cat1", "Cat2", "Cat3", "Cat4", "Cat5", "Cat6", "Cat7", "Cat8", "Cat9", "Cat10"};
		Map<String, Cat> catMap = new HashMap<String, Cat>(catNames.length);	
		for(String name : catNames)
			catMap.put(name, new Cat(name));
		
		for(	Iterator<Map.Entry<String, Cat>> it = catMap.entrySet().iterator();
				it.hasNext();) {
			Map.Entry<String, Cat> pair = it.next();
			System.out.printf("%s - %s\n", pair.getKey(), pair.getValue());
		}

//------ 4 ------

		System.out.println("\n№4\n");

		for(	Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
				it.hasNext();)
			System.out.println(it.next().getKey());

//------ 5 ------

		System.out.println("\n№5\n");

		for(	Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
				it.hasNext();)
			System.out.println(it.next().getValue());
		
//------ 6 ------

		System.out.println("\n№6\n");

		String[] t6keys = {
			"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
		Object[] t6values = {
			"Hello", 1, 5d, 'd', 0.1, "1", -5, 0.001, new Cat("Cat"), new Cat("Cat12").name};
		Map<String, Object> t6map = new HashMap<>(t6keys.length);
		MyUtil.fillMap(t6map, t6keys, t6values);

		for(	Iterator<Map.Entry<String, Object>> it = t6map.entrySet().iterator();
				it.hasNext();) {
			Map.Entry<String, Object> pair = it.next();
			System.out.printf("%s - %s\n", pair.getKey(), pair.getValue());
		}
	}
}