package PrakashSirSpecific;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "mama";
		String s2 = "amma";

		String[] ar1 = s1.split("");// m,a,m,a
		String[] ar2 = s2.split("");// a,m,m,a

		Arrays.sort(ar1);// a,a,m,m
		Arrays.sort(ar2);// a,a,m,m

		if (Arrays.equals(ar1, ar2)) {

			System.out.println("Anagram");

		} else
			System.out.println("not anagram");
	}

}
