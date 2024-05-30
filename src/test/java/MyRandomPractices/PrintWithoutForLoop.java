package MyRandomPractices;

public class PrintWithoutForLoop {

	public static void main(String[] args) {

		// printNumber(10);
		// printNumber1(1);
		   System.out.println(printNumber3(1));
	}

//	static void printNumber(int n) {// 10
//		if (n > 0) {
//			printNumber(n - 1);// print 9
//			System.out.print(n + " ");
//		}
//	}

//	static void printNumber1(int n) {
//		System.out.print(n + " ");
//		if (n < 10) {
//			printNumber1(n + 1);
//
//		}
//	}

//	static void printNumber2(int n) {
//
//		System.out.println(n);
//		if (n < 10) {
//			printNumber2(n + 1);
//		}
//	}

	static int printNumber3(int n) {

		if (n < 10)
			return printNumber3(n + 1);
		else
			return 1;

	}

}
