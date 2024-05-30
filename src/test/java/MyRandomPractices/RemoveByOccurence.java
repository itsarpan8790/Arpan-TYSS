package MyRandomPractices;

public class RemoveByOccurence {
	public static void main(String[] args) {
		String s = "abccba";
		String s1 = "abccba";

		String temp = "";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				if (count < 2)// whose count is 1
					temp = temp + s.charAt(i);
				count = 1;
			}

		}
		temp = temp + s.charAt(s.length() - 1);
		System.out.println(temp);
	}

}
