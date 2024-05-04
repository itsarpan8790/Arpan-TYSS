package PrakashSirSpecific;

import java.io.BufferedReader;
import java.io.FileReader;

public class DDT_NotePad_Pending {
	public static void main(String[] args) throws Throwable {
		FileReader file = new FileReader(".\\src\\test\\resources\\DDT.txt");
		BufferedReader bfr = new BufferedReader(file);
		

		while (bfr.ready()) {
			System.out.println(bfr.readLine());
		}
	}
}
