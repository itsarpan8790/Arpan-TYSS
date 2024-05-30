package MyRandomPractices.Rajnish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(3, 4, 5));

		// o/p--l1 12 5

		for (int i = 0; i < l2.size(); i++) {
			if (l1.contains(l2.get(i))) {
				l1.remove(l2.get(i));
			} else {
				l1.add(l2.get(i));
			}
		}
		System.out.println(l1);
	}

}
