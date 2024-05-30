package MyRandomPractices;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseArrayElements {
	static Scanner sc = new Scanner(System.in);

	@Test
	public static void reverseArrayWay1() {
		System.out.println("Enter Length Of Array");
		int len = sc.nextInt();
		int ar1[] = new int[len];
		int ar2[] = new int[len];

		System.out.println("Enter Elements Array");
		for (int i = 0; i < ar1.length; i++) {
			if (i == len - 1)
				System.out.println("Enter Last Element");
			ar1[i] = sc.nextInt();

		}

		for (int i = ar1.length - 1; i >= 0; i--) {
			ar2[len - (i + 1)] = ar1[i];
			System.out.println(ar2[len - i - 1]);

		}

	}

	@Test
	public static void reverseArrayWay2() {

		int ar1[] = { 1, 2, 3, 4, 5, 6 };
		int ar2[] = new int[ar1.length];
		int len = ar1.length;
		int mid = ar1.length / 2;
		
		int i = 0;
		while (i < ar1.length) {
			for (int j = ar2.length - 1; j >= 0; j--) {
				ar2[j] = ar1[i];
				i++;

			}

		}
		for (int a : ar2) {
			System.out.println(a);
		}
	}

	@Test
	public static void reverseHalfArray() {

		int ar1[] = { 1, 2, 3, 4, 5, 6 };
		int ar2[] = new int[ar1.length];
		int len = ar1.length;
		int mid = ar1.length / 2;

		for (int i = 0; i < ar1.length; i++) {
			if (i < mid) {
				ar2[i] = ar1[i];
			} else
				for (int j = ar1.length - 1; j >= mid; j--) {
					ar2[i] = ar1[j];
					i++;
				}

		}
		for (int a : ar2) {
			System.out.println(a);
		}

	}

}
