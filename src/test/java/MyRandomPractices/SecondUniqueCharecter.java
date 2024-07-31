package MyRandomPractices;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class SecondUniqueCharecter {
	@Test
	void usingVariable() {
		String str = "easiest";
		char[] ar = str.toCharArray();

		char sunique = ar[0];
		int occurenceUnique = 0;
		for (int i = 0; i < ar.length; i++) {

			int count = 0;

			for (int j = 0; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
				}

			}
			if (count == 1) {
				sunique = ar[i];
				occurenceUnique++;
				if (occurenceUnique == 2)
					break;
			}

		}
		System.out.println(sunique);
	}

}
