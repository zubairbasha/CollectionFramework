package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapPractice {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		/*
		 * Java HashMap is based on the Key
		 * Java HashMap contains unique Keys
		 * Java Hashmap can contains one null keys and multiple values
		 * It is not synchronized
		 * It doesnot maintain any order
		 * Initial Default capacity is 16 and with load factor as 0.75 
		 * */
		map.put(10, "ZUbair");
		map.put(2, "Basha");
		map.put(3, "Ashik");
		map.putIfAbsent(1, "Nihal");
		//map.put(null, "Harish");
		System.out.println(map);
		//Set KeySet()
		System.out.println(map.keySet());
		//Set entrySet()
		//It will return all the key and value
		System.out.println(map.entrySet());
		//clear method is used to reset the map
		//map.clear();
		//To Interate the map
		for(Map.Entry<Integer,String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			System.out.println(m.hashCode());
		}
		//TO compare the map
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
	    Map<Integer,Book> map2=new HashMap<>();
	    map2.put(1, b1);
	    map2.put(2, b2);
	    map2.put(3, b3);
	    
	    //Traversing a Map
	    for(Map.Entry<Integer, Book> m:map2.entrySet()) {
	    	int key=m.getKey();
	    	Book b=m.getValue();
	    	System.out.println("Key :"+key);
	    	System.out.println(" Value :"+b.toString());
	    }
		Book b4=b1;
		System.out.println(b4.hashCode());
		System.out.println(b1.hashCode());
	}
}
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	
	
}
