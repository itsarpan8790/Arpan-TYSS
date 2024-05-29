package myrandomPractises;

public class FacrorialUsingRecursion {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		//System.out.println(fact(5));
	}

	public static long factorial(int n) {

		if (n != 0)//50
			return n * factorial(n - 1);
		else
			return 1;
	}

	public static long fact(int n) {
		int product = 1;
		for (int i = 1; i <= n; i++) {
			product = product * i;
		}
		return product;

	}

}
