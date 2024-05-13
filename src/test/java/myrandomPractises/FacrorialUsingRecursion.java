package myrandomPractises;

public class FacrorialUsingRecursion {

	public static void main(String[] args) {
		System.out.println(factorial1(5));
		//System.out.println(factorial2(50));
	}

	public static int factorial1(int n) {

		if (n != 0)
			return n * factorial1(n - 1);
		else
			return 1;
	}

//	public static int factorial2(int n) {
//		int product = 1;
//		for (int i = 1; i <= 5; i++) {
//			product = product * i;
//		}
//		return product;
//
//	}

}
