package MyRandomPractices.duplicatePractise;

public class GivenStringContainsSubstring {
	public static void main(String[] args) {
		String s1 = "i am arpan";
		String s2 = "arpan";

		char as1[] = s1.toCharArray();
		char as2[] = s2.toCharArray();

		int count = 0;
		for (int i = 0; i < as1.length; i++) {

			for (int j = 0; j < as2.length && as1[i] == as2[j]; j++) {
				i++;

				if (j == as2.length - 1) {
					count++;
					break;
				}

			}

		}
		System.out.println(count);
		if (count == 1)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
