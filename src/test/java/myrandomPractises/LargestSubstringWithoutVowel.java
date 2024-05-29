package myrandomPractises;

import org.testng.annotations.Test;

public class LargestSubstringWithoutVowel {
@Test
	public static void method() {
		String s1 = "1234567encyclopedia"; //nycl
		int max = 0;
		String Largest = "";

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			// To check concatination Starts only from Consonents
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;//skip the loop
			} 
			else {
				// Concat Block
				String temp = "";
				for (int j = i; j < s1.length(); j++) {
					char ch1 = s1.charAt(j);
					if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
						break;// breaks and stores Value up to consonents
					} else {
						temp = temp + ch1;

					}
					//i=j;
				}

				if (temp.length() > max) {
					max = temp.length();
					Largest = temp;

				}

			}

		}
		System.out.println(Largest);

	}

}