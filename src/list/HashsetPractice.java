package list;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetPractice {
	public static void main(String[] args) {
		//Creating a HashSet and adding elements
		HashSet<String> set=new HashSet<>();
		set.add("Zubair");
		set.add("Basha");
		set.add("Ashik");
		set.add("Basha");
		//Accessing the Hashset value
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//set.remove("Zubair");
		System.out.println(set);
		System.out.println(set.add("Zubair"));
	
	}
}
