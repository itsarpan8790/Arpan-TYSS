package practiseAllSDET52;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DDT_NotePad {
	public static void main(String[] args) throws IOException,FileNotFoundException,Throwable  {
		FileReader file = new FileReader("./src/test/resources/DDT.txt");
		BufferedReader bfr = new BufferedReader(file);
		

//		while (bfr.readLine() != null) {
//			System.out.print(bfr.readLine());
//		}
		
		while (bfr.ready()) {
			System.out.println(bfr.readLine());
		}
	}
}
