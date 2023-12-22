package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {
	public static void main(String[] args) {
		//How to create a list
		List<String> list=new ArrayList<>();
		//How to convert Array to List
		String[] a= {"C","Python","Java"};
		for(String programmingLanguage:a) {
			list.add(programmingLanguage);
		}
		System.out.println(list);
		String[] b=list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(b));
	}
}
