package list;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class LinkedHashSetPractice {
	public static void main(String[] args) {
	LinkedHashSet<String> words=new LinkedHashSet<>();
	/*
	 * The only difference between Hashset and Linked Hash set it follow
	 * the insertion order.
	 * */
	words.add("Zubair");
	words.add("Basha");
	System.out.println(words);
	TreeSet<String> words2=new TreeSet<>();

	System.out.println(words2);
	SortedSet<String> syn=Collections.synchronizedSortedSet(words2);
	 TreeSet<String> words3 = new TreeSet<>();
     words2.add("A");  
     words2.add("B");  
     words2.add("C");  
     words2.add("D");  
     words2.add("E"); 
 // System.out.println(words2.descendingSet());
  System.out.println("Head Set Value :"+words2.headSet("C",false));
  System.out.println("Subset value :"+words2.subSet("A",false,"C",false));
  System.out.println("Tail Set Value :"+words2.tailSet("C",false));
    
	}
}
