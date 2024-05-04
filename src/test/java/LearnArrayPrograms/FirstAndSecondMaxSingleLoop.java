package LearnArrayPrograms;

import org.testng.annotations.Test;

public class FirstAndSecondMaxSingleLoop {
	@Test
	public void firstSecondMax() {
		int[] ar = { 30, 15, 5, 20, 2, 3 };

		int fmax = ar[0];// 30
		int smax = ar[1];// 15

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > fmax) {

				smax = fmax;
				fmax = ar[i];
			} else if (ar[i]>smax && ar[i]< fmax) {

				smax = ar[i];
			}

		}
		System.out.println(fmax + " " + smax);
	}

}
