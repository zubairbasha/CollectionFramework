package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapPractice {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(10, "ZUbair");
		map.put(2, "Basha");
		map.put(3, "Ashik");
		map.putIfAbsent(1, "Nihal");
		System.out.println(map);
		//Set KeySet()
		System.out.println(map.keySet());
		//Set entrySet()
		//It will return all the key and value
		System.out.println(map.entrySet());
		//clear method is used to reset the map
		//map.clear();
		//To Interate the map
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			System.out.println(m.hashCode());
		}
		//TO compare the map
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	}
}
