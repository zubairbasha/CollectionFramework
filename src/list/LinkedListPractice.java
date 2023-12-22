package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// Constructors
		/**
		 * public LinkedList(); public LinkedList(Collection<? extends E> c)
		 */
		// Adding in the Linked List
		LinkedList<String> words = new LinkedList<>();
		words.add("Zubair");
		words.add("Basha");
		words.add("Ashik");
		words.add("Basha");
		//Iterating a Linked List
		Iterator itr=words.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		words.remove("Basha");
		System.out.println(words);
		//Reverse a list
		itr=words.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
		/*When we want to use arraylist and when we want to use linked list
		 * 1.Addding and Removing is more go for LinkedList. Accessing a data is more 
		 * go for Arraylist
		 * 2.
		 * */
		words.push("Fareed");
		System.out.println(words);
		words.pop();
		System.out.println(words);
		System.out.println(words.indexOf("Zubair"));
		words.clear();
		System.out.println(words);
		
	}
}
