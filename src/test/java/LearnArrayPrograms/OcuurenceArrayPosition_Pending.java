package LearnArrayPrograms;

import org.testng.annotations.Test;

public class OcuurenceArrayPosition_Pending {
	@Test
	public void occurence() {
		int[] ar = { 1, 2, 2, 3, 4, 5, 6, 3, 5, 3, 1 };
		boolean[] br = new boolean[ar.length];

		for (int i = 0; i < ar.length; i++) {
			if (br[i] == false) {
				int a = ar[i];// t
				int index = 0;
				for (int j = 0; j < ar.length; j++) {
					if (a == (ar[j])) {
						index = j;
						br[j] = true;
						if (i < j) {
							System.out.println(ar[i] + "-" + j);
						}

					}
				}
			}

		}

	}

}
