package MyRandomPractices.duplicatePractise;

public class My$Name$is$Arpan {

	public static void main(String[] args) {
		String s1 = "my$ na%me is$ %prak@sh";
		// ym$ em%an si$ %hska@rp
		String[] ar1 = s1.split(" ");

		String s2 = "";
		for (int i = 0; i < ar1.length; i++) {
			// Remove S.C. and reverse
			for (int j = ar1[i].length() - 1; j >= 0; j--) {
				if (ar1[i].charAt(j) >= 'a' && ar1[i].charAt(j) <= 'z') {
					s2 = s2 + ar1[i].charAt(j);
				}
			}
			s2 = s2 + " ";
		}
		String rev = s2.replaceAll(" ", "");
		System.out.println(rev);

		// Printing the output part
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				System.out.print(rev.charAt(count++));
			}

			else {
				System.out.print(s1.charAt(i));
			}

		}
	}

}
