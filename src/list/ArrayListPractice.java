package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("Zubair");
		words.add("Basha");
		words.add("Ashik");
		//Current size and Capacity
//ArrayList is not Thread Safe it doesnot provide the synchronized
		//ArrayList can Contains Duplicate Element
		//ArrayList class maintains Insertion Order
		//WE can create the ArrayList for Wrapper Class not primitive types
		//Manipulation is bit slow in Arraylist than LinkedList as it should do lots of shifting
		//we can use iterator to iterate the arraylist
		Iterator itr=words.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//itr.remove();
		itr=words.iterator();
		while(itr.hasNext()) {
			System.out.println("After"+itr.next());
			//itr.remove();
		}
		//Iterating the element using for each loop
		for(String str:words) {
			System.out.println("Using For Each Loop "+str);
		}
		//words.set(1, "Zubair");
		for(String str:words) {
			System.out.println("Using For Each Loop  and After removing"
					+ " "+str);
		}
		//Sort the ArrayList using Collections.sort method
		Collections.sort(words,Comparator.reverseOrder());
		System.out.println(words);
		Collections.sort(words,Comparator.naturalOrder());
		System.out.println(words);
		words.forEach(a->System.out.println(a));
		itr=words.iterator();
		//itr.forEachRemaining(a->System.out.println(a));
		ArrayList<String> words2=new ArrayList<>();
		System.out.println(words2.isEmpty());
		
	}
	
}


