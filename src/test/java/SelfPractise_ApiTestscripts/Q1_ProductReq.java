package SelfPractise_ApiTestscripts;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import selfPractise_APIPojos.Q1_Details;
import selfPractise_APIPojos.Q1_Product;

public class Q1_ProductReq {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		File file = new File(".\\src\\test\\resources\\Product.json");

		Q1_Details p1 = new Q1_Details("Laptop", 1000);
		Q1_Details p2 = new Q1_Details("Smartphone", 500);
		Q1_Details p3 = new Q1_Details("Tablet", 300);

		Q1_Details ar[] = { p1, p2, p3 };

		Q1_Product pojo = new Q1_Product(ar);

		ObjectMapper obm = new ObjectMapper();
		obm.writerWithDefaultPrettyPrinter().writeValue(file, pojo);

		//For practise
		pojo.getDetails()[0].setName("Lenovo");
		String nameOfZeroth = pojo.getDetails()[0].getName();
		System.out.println(nameOfZeroth);

	}

}
