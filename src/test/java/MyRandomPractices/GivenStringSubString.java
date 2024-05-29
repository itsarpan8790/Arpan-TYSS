package MyRandomPractices;

import org.testng.annotations.Test;

public class GivenStringSubString {
	@Test
	public void usingWhile() {
		String str = "iamarpan";
		String substr = "arpan";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			int j = 0;
			while (j < substr.length() && str.charAt(i) == substr.charAt(j)) {
				j++;
				i++;

			}
			if (j == substr.length()) {
				count++;
				break;
			}

		}
		if (count == 0)
			System.out.println("no");
		else
			System.out.println("yes");

	}

	@Test
	public void usingFor() {
		String str = "iamarpan";
		String substr = "arpan";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < substr.length() && str.charAt(i) == substr.charAt(j); j++) {

				i++;

				if (j == substr.length()) {
					count++;
					break;
				}

			}
		}
		if (count == 0)
			System.out.println("no");
		else
			System.out.println("yes");

	}

}
