package map;

import java.util.Hashtable;

public class HashTablePractice {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashTable=new Hashtable<>();
		hashTable.put(1, "Zubair");
		hashTable.put(2, "Basha");
		hashTable.put(3, "Ashik");
		hashTable.put(4,"Basha");
		hashTable.putIfAbsent(4,"Nihal");
		hashTable.remove(3);
		System.out.println(hashTable);
		System.out.println(hashTable.getOrDefault(100, "Not found"));
		//getOrDefault method is used to find whether the element is found or not or else return the default value
		
	}

	
}