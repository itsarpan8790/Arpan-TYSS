package MyRandomPractices;

import org.testng.annotations.Test;

public class SecondUniqueCharecter {
	@Test
	void usingVariable() {
		String str = "easiest";
		char[] ar = str.toCharArray();
		
		char sunique = ar[1];// a
		int count1 = 0;
		for (int i = 0; i < ar.length; i++) {

			int count = 0;
			
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
				}

			}
			if (count == 1) {
				sunique = ar[i];
				count1++;
				if (count1 == 2)
					break;
			}

		}
		System.out.println(sunique);
	}

}
