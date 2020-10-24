
package lists;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List <String> fruits = new ArrayList();
		List <String> vegetables = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("hi");
		
//		vegetables.add("Potato");
//		vegetables.add("Tomato");
//		vegetables.add("Carrot");
//		
//		fruits.addAll(vegetables);
		
//		System.out.println(fruits.get(1));
		
//		fruits.set(1, "Banana");
//		System.out.println(fruits);
//		
//		fruits.remove(2);
//		System.out.println(fruits);
//		
//		fruits.clear();
//		System.out.println(fruits);
		
//		List <String> toRemove =new ArrayList();
//		toRemove.add("Apple");
//		toRemove.add("hi");
//		
//		fruits.removeAll(toRemove);
//		System.out.println(fruits);	
		
//		System.out.println(fruits.size());
		
//		System.out.println(fruits.contains("Gavava"));
//		System.out.println(fruits.contains("Apple"));
		
//		System.out.println(fruits.isEmpty());
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for(String e: temp) {
		System.out.println(e);
		}
//		
//		Pair<String, Integer> p1 = new Pair("priyanka" , 25);
//		Pair<String, Integer> p2 = new Pair(true, "hello");
//		
//		p1.getDescription();
//		p2.getDescription();
	}

}
