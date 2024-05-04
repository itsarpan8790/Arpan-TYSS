package LearnArrayPrograms;

public class AK_BubbleSortingPractise_Ascending {
	public static void main(String[] args) {
		int[] ar = { 0,100,4, 3, 2, 1, 65, 43, 21, 83 };
		int temp = 0;
		int size = ar.length;
		
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					temp = ar[j];//4
					ar[j] = ar[j + 1];//3
					ar[j + 1] = temp;
				}
			}

		}
		System.out.println("Afetr Sorting");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}

	}
}
