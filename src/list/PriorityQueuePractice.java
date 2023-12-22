package list;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
	public static void main(String[] args) {
		//PriorityQueue, LinkedList,ArrayBlockingQueue are the
		//implementation of Queue Interface
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("Zubair");
		queue.add("Basha");
		queue.add("Ashik");
		System.out.println(queue);
		System.out.println("Head :"+queue.element());
		System.out.println("Head: "+queue.peek());
		/*
		 * The Only difference between element() and peek() method is
		 * if the element is not found element method throw exception whereas 
		 * peek method will not throw an exception it will return null as a value*/
		queue.remove();
		System.out.println(queue);
		queue.poll();
		/*
		 * remove() removes the element in the queue if it is found or else it will
		 * throw an exception where as same like remove method poll remove the head element whereas if
		 * the value is not found it will not throw an exception it will return null value.*/
		System.out.println(queue);
		/*
		 * When we define the User Defined Data when need to implement the Comparator Interface in the Class
		 * and we need to Overide the Method of Comparator Interface*/
	}
}
