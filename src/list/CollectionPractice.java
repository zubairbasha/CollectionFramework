package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionPractice {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(46);
		list.add(67);
		list.add(24);
		list.add(16);
		list.add(8);
		list.add(12);
		System.out.println("Maximum :" + Collections.max(list));
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Binary Search :" + Collections.binarySearch(list, 24));
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
//		Collections.sort(al, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.age>o2.age) {
//					return 1;
//				}else if(o1.age<o2.age) {
//					return -1;
//				}else {
//					return 0;
//				}
//				
//			}
//		});
//		Comparator<Student> cm=Comparator.comparing(Student::getAge);
//		Collections.sort(al,cm);
//		for (Student st : al) {
//			System.out.println(st.rollno + " " + st.name + " " + st.age);
//		}
		List<String> list23=Collections.emptyList();
		System.out.println(list23);
	}
}

class Student{
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}