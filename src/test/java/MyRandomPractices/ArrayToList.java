package MyRandomPractices;

import java.util.Map.Entry;
import java.util.TreeMap;

public class ArrayToList {

	// Method 1
	public static void byTreeMap(String str) {
		String[] ar = str.split(" ");
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		for (int i = 0; i < ar.length; i++) {
			tm.put(ar[i].length(), ar[i]);
		}

		for (Entry<Integer, String> map : tm.entrySet()) {
			System.out.print(map.getValue() + " ");
		}
		System.out.println();

	}

	// Method 2
	public static void bySwapping(String str) {
		String[] ar = str.split(" ");

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				String temp = "";
				if (ar[j].length() > ar[j + 1].length()) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}

			}

		}
		for (String a : ar) {
			System.out.print(a + " ");
		}
	}

	// Method 3
	public static void byInfiniteWhileLoop(String str) {
		String[] ar = str.split(" ");
		String temp = "";
		boolean flag = true;

		while (true) {
			flag = false;
			for (int i = 0; i < ar.length - 1; i++) {
				if (ar[i].length() > ar[i + 1].length()) {
					temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
					flag = true;
				}

			}
		}

	}

	public static void main(String[] args) {
		String str = "books are loving to everyone";
		// Method 1
		byTreeMap(str);
		// Method 2
		bySwapping(str);
		// Method 3
	}
}
