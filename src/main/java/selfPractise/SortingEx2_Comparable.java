package selfPractise;

import java.util.ArrayList;
import java.util.Collections;

public class SortingEx2_Comparable {

	public static void main(String[] args) {

		SortingEx1_Comparable s1 = new SortingEx1_Comparable("Arpan", 30);
		SortingEx1_Comparable s2 = new SortingEx1_Comparable("Azad", 20);

		ArrayList<SortingEx1_Comparable> al = new ArrayList<SortingEx1_Comparable>();

		al.add(s1);
		al.add(s2);
		Collections.sort(al);
		//System.out.println(al);
		
		for(SortingEx1_Comparable a:al) {
			System.out.println(a.age);
		}
		System.out.println("end");

	}
}
