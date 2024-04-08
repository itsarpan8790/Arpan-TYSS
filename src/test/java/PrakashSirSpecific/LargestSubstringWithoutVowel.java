package PrakashSirSpecific;

public class LargestSubstringWithoutVowel {

	public static void main(String[] args) {
		String s = "encyclopedia"; // ncycl

		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String temp = "";
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				for (int j = i + 1; j < s.length(); j++) {
					char d = s.charAt(j);
					if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {
						break;
					} else {
						temp = temp + d;
					}

				}

			}
			if (temp.length() > max) {
				max = temp.length();
				System.out.println(temp);
			}
		}
	}

}
