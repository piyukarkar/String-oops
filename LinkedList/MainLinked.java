package lists.LinkedList;

import java.util.*;

public class MainLinked {

	public static void main(String[] args) {
	  
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		
//		getTimeDiff(al);
//		getTimeDiff(ll);
//	}
//	
//	static void getTimeDiff(List<Integer> list) {
//		
//		long start = System.currentTimeMillis();
//		
//		for(int i = 0; i<100000; i++) {
//			list.add(0,i);
//		}
//		
//		long end = System.currentTimeMillis();
//		
//		System.out.println(list.getClass().getName() + 
//				"  -->" + (end - start));
//		
////		ll.add(12);
////		ll.add(2);
////		ll.add(32);
////		System.out.println(ll.get(1));

		
		MyLinkedList<String> myLL = new MyLinkedList();
//		
//		myLL.add(12);
//		myLL.add(56);
		
		for(int i = 0; i<10; i++) {
			myLL.add(i +"added");
		}
		
		myLL.print();
		
	}

}

