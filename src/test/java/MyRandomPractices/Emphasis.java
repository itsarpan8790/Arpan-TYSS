package MyRandomPractices;

import java.util.HashSet;

import org.testng.annotations.Test;

import com.github.fge.jsonschema.main.cli.Main;

public class Emphasis {

	@Test
	public static void q1() {
		HashSet<String> hs = new HashSet<String>();
		String str = "I Love Dogs";
		String s = str.replaceAll(" ", "");
		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < s.length(); j++) {
				if (!(s.charAt(i) == s.charAt(j))) {
					String x = s.charAt(i) + "" + s.charAt(j) + " ";
					hs.add(x);

				}

			}

		}
		for (String a : hs) {
			System.out.print(a);
		}

	}

	@Test
	public static void q2() {
		String s = "Royal";
		s = s.toLowerCase();

		System.out.println(s);

	}

	@Test
	public static void q3() {

		String str = "the smallest unit of my life";
		String ar[] = str.split(" ");
		String s = "";
		for (int i = 0; i < ar.length; i++) {

			String[] ar2 = ar[i].split("");

			for (int j = 0; j < ar2.length; j++) {
				if (j == 0) {
					s = s + ar2[j].toUpperCase();
				} else {
					s = s + ar2[j];
				}
			}
			s = s + " ";

		}
		System.out.println(s);

	}
	@Test
	public static void q4() {

		String str = "the smallest unit of my life";
		char ar[]=str.toCharArray();
		String nw="";
		for(int i=0;i<str.length();i++) {
			if(i==0) {
				nw=nw+(char)(str.charAt(i)-32);
			}else if(str.charAt(i-1)==' ') {
				nw=nw+(char)(str.charAt(i)-32);
			}else {
				nw=nw+str.charAt(i);
			}
		}
		System.out.println(nw);
		
		
		
	}

}
