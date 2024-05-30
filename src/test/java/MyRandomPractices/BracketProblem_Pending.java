package MyRandomPractices;

public class BracketProblem_Pending {
	public static void main(String[] args) {
		String s = "[{(arpan)}]";
		char ar[] = s.toCharArray();//

		String word = "";
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] >= 'a' && ar[i] <= 'z') {
				word = word + ar[i];
			}

		}
		System.out.println(word);

		int lcount = 0;
		int rcount = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] >= 'a' && ar[i] <= 'z') {
				lcount = i;
				break;
			}
		}
		System.out.println("lcount-" + lcount);
		for (int i=word.length()-1; i < s.length(); i++) {
			rcount++;

		}
		System.out.println("rcount-"+rcount);
		if(lcount==rcount)
			System.out.println("Valid String");
		else
			System.out.println("Invalid");
	}
}
