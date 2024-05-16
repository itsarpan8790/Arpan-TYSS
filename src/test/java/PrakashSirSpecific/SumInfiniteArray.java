package PrakashSirSpecific;

public class SumInfiniteArray {
	
	public static void main(String[] args) {
		int ar []= {1,2,3};         //int infyAr2 []={1,2,3, 1,2,3,1,2,3, 1,2,3.....}
		int length=ar.length;//3
		int L=3 ,R=8;
		
		int sum=0;
		
		for (int i = L; i <=R; i++) {//3-8
			
				sum=sum+ar[i%length]; //  3/3  4/3  5/3    6/3 7/3 8/3 9/3 
			
		}
		System.out.println(sum);
		System.out.println(2%3);
		
	}

}
