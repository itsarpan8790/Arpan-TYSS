package InterView_Asked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class SureMindsSolutions {

	@Test(priority = 1)
	public void maxLengthWord() {
		String s = "I love book reading";
		String ar[] = s.split(" ");

		int max = ar[0].length();
		String value = ar[0];
		for (int i = 0; i < ar.length; i++) {

			if (ar[i].length() > max) {
				max = ar[i].length();
				value = ar[i];
			}
		}

	}

	@Test
	public void maxLengthWordRepeated() {
		String s = "I love book writing reading";
		String ar[] = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int max = ar[0].length();

		for (int i = 0; i < ar.length; i++) {
			if (ar[i].length() > max) {
				max = ar[i].length();
			}
			hm.put(ar[i], ar[i].length());
		}

		for (Entry<String, Integer> h : hm.entrySet()) {
			if (h.getValue() == max)
				System.out.println(h.getKey() + " " + h.getValue());
		}

	}
	
	

	@Test(priority = 2)
	public void countEachWord() {
		String s = "I love book reading";
		String ar[] = s.split(" ");

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " length is " + ar[i].length());

		}
	}

	@Test(priority = 3)
	public void stateCity() {
		ArrayList<String> al = new ArrayList<String>();

		al.add("city 1 State1");
		al.add("city 2 State2");
		al.add("city 3 State1");
		al.add("city 4 State3");

		for (String a : al) {
			if (a.contains("State1")) {
				System.out.println(a);
			}
		}

	}

}
