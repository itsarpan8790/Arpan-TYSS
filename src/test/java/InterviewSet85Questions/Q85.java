package InterviewSet85Questions;

public class Q85 {
	public static void main(String[] args) {
//		i/p: {1,3,5,7,9},k=2
//		O/p -{9,1,3,5,7}
//	          {9,1,2,5,7}

		int k = 2;
		int ar[] = { 1, 3, 5, 7, 9 };

		for (int i = 0; i < ar.length - 1; i++) {
			int temp = ar[0];
			for (int j = 1; j < ar.length; j++) {
				ar[j - 1] = ar[j];
				System.out.print(ar[j] + " ");
			}
			ar[ar.length - 1] = temp;
			System.out.println(temp);
		}

		for (int i = 0; i < ar.length; i++) {
			if (i == k) {
				ar[i] = k;
			}
			System.out.print(ar[i]);
		}

	}

}
