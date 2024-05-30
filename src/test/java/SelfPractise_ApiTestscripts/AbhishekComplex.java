package SelfPractise_ApiTestscripts;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import selfPractise_APIPojos.AbhishekComplexBody.Lotto;
import selfPractise_APIPojos.AbhishekComplexBody.MainRequest;
import selfPractise_APIPojos.AbhishekComplexBody.Winners;

public class AbhishekComplex {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		File f=new File(".\\src\\test\\resources\\Abhishek.json");
		
		int [] num1= {2,45,24,23,3,5};
		int [] num2= {52,3,12,11,18,22};
		Winners win1 = new Winners(23, num1);
		Winners win2 = new Winners(54, num2);
		Winners [] winner= {win1,win2};
		int ar[]= {2,45,23,7,5,3};
		Lotto lotto=new Lotto(5, ar, winner);
		MainRequest main=new MainRequest(lotto);
		
		ObjectMapper obm=new ObjectMapper();
		obm.writerWithDefaultPrettyPrinter().writeValue(f, main);
		//json mapping exception--if obm.writevalue-we passs wrong argument-f,obm instead f,main
		System.out.println("Done");
	}

}
