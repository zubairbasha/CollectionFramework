package list;

import java.util.Properties;
import java.util.Set;
import java.util.Vector;

public class PropertiesPractice {
	public static void main(String[] args) {
		Properties p=System.getProperties();
		Set set=p.entrySet();
		System.out.println(p.getProperty("java.specification.name"));
		Vector<String> v=new Vector<>();
		v.add("ZUbair");
		v.add("Basha");
		v.add("Ashik");
		System.out.println("Before Sort :"+v);
		v.sort((o1,o2)->o1.compareTo(o2));
		System.out.println("After Sort :"+v);
	}
}
