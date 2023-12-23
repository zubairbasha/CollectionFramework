package map;

import java.util.TreeMap;

public class TreeMapPractice {
	public static void main(String[] args) {
		/*
		 * TreeMap doesnot allow to store null value
		 * TreeMap contains Unique elements
		 * It maintains Ascending Order*/
		//Initialization
		TreeMap<Integer,String> map=new TreeMap<>();
		map.put(1, "Zubair");
		map.put(5, "Ashik");
		//map.put(null,"Fareed");
		map.put(2, null);
		//We can add Value as a Null in tree map, but we cannot add
		//the key as a null
		System.out.println(map);
	}
}
