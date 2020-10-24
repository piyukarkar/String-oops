package lists.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer>mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(12);
		mq.enqueue(123);
		mq.enqueue(45);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(12);
		
		System.out.println(mq.dequeue());
		
		
		
		
		
		
		
		
		
		
		
//		Queue<Integer> q = new LinkedList<>();
		
//		q.remove();
		
//		System.out.println(q.poll());
//		q.add(12);
//		q.add(32);
//		q.add(52);
//		
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		
//		System.out.println(q.element());

	}

}

