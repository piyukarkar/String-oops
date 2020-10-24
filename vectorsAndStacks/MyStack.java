package lists.vectorsAndStacks;

import java.util.Stack;
import java.util.Vector;

public class MainClass {
	
	public static void main(String[]args) throws Exception {

//		Vector<Integer> v = new Vector();
//		
//		v.add(32);
//		v.add(52);
//	
//	
//	System.out.println(v);

		MyStack<Integer> stack = new MyStack();
		
		stack.push(12);
		stack.push(24);
		stack.push(36);
		
		int popped = stack.pop();
		
		System.out.println(popped);
		
		int peeked=  stack.peek();
		
		System.out.println(peeked);
}

}
