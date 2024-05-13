package selfPractise;

import java.util.ArrayList;
import java.util.Collections;

public class SortingEx1_Execution {

	public static void main(String[] args) {

		SortingEx1_Comparable s1 = new SortingEx1_Comparable("arpan", 30);
		SortingEx1_Comparable s2 = new SortingEx1_Comparable("Azad", 20);

		ArrayList<SortingEx1_Comparable> al = new ArrayList<SortingEx1_Comparable>();

		al.add(s1);
		al.add(s2);
		Collections.sort(al);
	  //System.out.println(al);
		
//		for(SortingEx1_Comparable a:al) {
//			System.out.println(a.age);
//		}
		
		for(SortingEx1_Comparable a:al) {
			System.out.println(a.name);
		}
		

	}
}
