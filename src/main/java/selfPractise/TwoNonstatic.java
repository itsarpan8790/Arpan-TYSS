package selfPractise;

import org.testng.annotations.Test;

public class TwoNonstatic {
	
	public void m1() {
		System.out.println("method 1");
	}
	@Test
	public static void m2() {
		TwoNonstatic mm = new TwoNonstatic();
		mm.m1();
		System.out.println("method 2");
	}

}
