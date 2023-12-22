package list;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeuePractice {
	public static void main(String[] args) {
	Deque<String> deque=new ArrayDeque<>();
	deque.add("zubair");
	deque.add("basha");
	deque.add("nihal");
	deque.add("ashik");
	System.out.println(deque);
	//offers
	deque.offerFirst("ashik");
	System.out.println(deque);
	//duplicate elements are allowed in dequeue
	deque.offer("Fareed");
	//by defalut it is offer last. we can use offer or offerlast method
	//to add at the end
	System.out.println(deque);
	deque.poll();
	System.out.println(deque);
	deque.pollLast();
	System.out.println(deque);
	
	}
}
