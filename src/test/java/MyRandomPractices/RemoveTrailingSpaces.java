package MyRandomPractices;

public class RemoveTrailingSpaces {
	public static void main(String[] args) {
		String s = "@@abc@@fg/k"; // o/p="abc fg/k"
		String s2 = "";
		int i = 0;
		while (i < s.length() && s.charAt(i) == '@') {
			i++;
		}

		//System.out.print(s.substring(i));
		for(int j=i;j<s.length();j++) {
			s2=s2+s.charAt(j);
		}
		System.out.println(s2);
	}

}
