package PrakashSirSpecific;

public class Q10_mynameispraksah {
	public static void main(String[] args) {
		String s1 = "my$ na%me is$ %prak@sh"; // ym$ em%an si$ %hska@rp
		String s2 = s1.replaceAll("[$@%]", "");

		String[] s3 = s2.split(" ");
		String rev = "";

		for (int i = 0; i < s3.length; i++) {
			String n = s3[i];// my
			for (int j = n.length() - 1; j >= 0; j--) {
				rev = rev + n.charAt(j);

			}
			rev = rev + " ";
		}
		String rev2 = rev.trim();
		String rev1 = rev2.replaceAll(" ", "");
		System.out.println(rev1);

//		int count = 0;
//		for (int i = 0; i < s1.length(); i++) {
//			if (s1.charAt(i) == ' '||s1.charAt(i) == '@' || s1.charAt(i) == '$' || s1.charAt(i) == '%')
//				System.out.print(s1.charAt(i));
//			else
//
//				System.out.print(rev1.charAt(count++));
//		}
//	}
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
				System.out.print(rev1.charAt(count++));

			else
				System.out.print(s1.charAt(i));

		}
	}

}
