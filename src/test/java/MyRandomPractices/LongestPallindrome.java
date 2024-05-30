package MyRandomPractices;

import org.testng.annotations.Test;

public class LongestPallindrome {

	public static boolean isPalindrome(String str) {
		String rev = "";
		for (int k = str.length() - 1; k >= 0; k--) {
			rev = rev + str.charAt(k);
		}

		if (str.equals(rev))
			return true;
		else
			return false;

	}

	@Test
	public void longestPallindromeUniversal0() {

		String s1 = "eemalayalameeiscity&malayalam&";
		int max = 1;
		String Largest = "";

		for (int i = 0; i < s1.length(); i++) {

			String s2 = "" + s1.charAt(i);
			for (int j = i + 1; j < s1.length(); j++) {
				s2 = s2 + s1.charAt(j);

				// Reversing the current String and--
				String rev = "";
				for (int k = s2.length() - 1; k >= 0; k--) {
					rev = rev + s2.charAt(k);
				}

				// --To check Pallindrome
				if (s2.equals(rev) && rev.length() > max) {
					max = rev.length();
					Largest = rev;
				}
			}

		}
		System.out.println(Largest);

	}

	@Test
	public void longestPallindromeUniversal1() {

		String s1 = "eemalayalameeiscity&malayalam&";
		int max = 1;
		String Largest = "";

		for (int i = 0; i < s1.length(); i++) {

			String s2 = "";
			for (int j = i; j < s1.length(); j++) {
				s2 = s2 + s1.charAt(j);

				// Reversing
				String rev = "";
				for (int k = s2.length() - 1; k >= 0; k--) {
					rev = rev + s2.charAt(k);
				}

				// To check Pallindrome
				if (s2.equals(rev) && rev.length() > max) {
					max = rev.length();
					Largest = rev;
				}
			}

		}
		System.out.println(Largest);

	}

	@Test
	public void longestPallindromeUniversal2() {

		String s1 = "eemalayalameeiscity&malayalam&";
		int max = 1;
		String Largest = "";

		for (int i = 0; i < s1.length(); i++) {

			String s2 = "";
			for (int j = i; j < s1.length(); j++) {
				s2 = s2 + s1.charAt(j);

				// To check Pallindrome
				boolean flag = isPalindrome(s2);
				if (flag && s2.length() > max) {
					max = s2.length();
					Largest = s2;
				}

			}

		}
		System.out.println(Largest);

	}

}