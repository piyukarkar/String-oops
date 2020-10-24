
package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		
		Set <Integer> x= new HashSet<>();
		
		x.add(23);
		x.add(1);
		x.add(6);
		
		Set <Integer> y =new HashSet<>();
		
		y.add(3);
		y.add(1);
		y.add(16);
		
//		x.addAll(y);
		
		x.retainAll(y);
		System.out.println(x.containsAll(y));//aa fun y ni ander je contaains che te x ni andr che ..jo che to true nhi to folse thse
		
		System.out.println(x);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Set<String> fruits = new HashSet<>();
//		
//		fruits.add("Apple");
//		fruits.add("Banana");
//		System.out.println(fruits.add("kiwi"));
//		
//		System.out.println(fruits.add("Banana"));//order gme tem hse ane apde aema 2times 1 j item nthi rakhi skta
//		
//		System.out.println(fruits);
		
//        Set<String> fruits = new LinkedHashSet<>();
//		
//		fruits.add("Banana");
//		fruits.add("kiwi");
//		fruits.add("Apple");
//	
//		System.out.println(fruits);//linked list thi apde je order ma item rakheli hse e j order ma print thse
//	
//		
		
//		Set<String> fruits = new TreeSet<>();
//		
//	
//		fruits.add("Banana");
//		fruits.add("kiwi");
//		fruits.add("Apple");
//	
//		
//		System.out.println(fruits);//treeset thi apde order ni rite print kri skiye

	}

}
