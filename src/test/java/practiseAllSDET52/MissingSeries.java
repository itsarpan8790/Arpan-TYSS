package practiseAllSDET52;

import java.util.ArrayList;
import java.util.Collections;

public class MissingSeries {
	public static void main(String[] args) {

		int[] ar = { 1, 3, 5 };
		int min = ar[0];
		int max = ar[0];

		// Finding min and max
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min)
				min = ar[i];
			else if (ar[i] > max)
				max = ar[i];

		}

		// Finding missing series
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = min; i <= max; i++) {
			al.add(i);

		}

		Collections.sort(al);
		System.out.println(al);
		System.out.println();
		for (int a1 : ar) {
			System.out.print(a1 + " ");
		}
		System.out.println();

		for (Integer a : al) {

			int ginti = 1;
			for (int i = 0; i < ar.length; i++) {
				if (a == ar[i])
					ginti++;
			}
			if (ginti == 1)
				System.out.println(a + " ");
		}
	}
}
