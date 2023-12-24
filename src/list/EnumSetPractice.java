package list;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public class EnumSetPractice {
	public static void main(String[] args) {
			Set<days> set=EnumSet.allOf(days.class);
			System.out.println(set);
		
	}
}

enum days {
	SUNDAY,MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}
