package MyRandomPractices.duplicatePractise;

import org.testng.annotations.Test;

public class Parent {
	
	@Test
	 static void method1() {
		System.out.println("1.Hii From Static parent");
	}
	@Test
	 static void method2() {
			System.out.println("2.Hii From non-Static parent");
		}

}
