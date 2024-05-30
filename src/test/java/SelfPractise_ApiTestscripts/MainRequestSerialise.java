package SelfPractise_ApiTestscripts;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import selfPractise_APIPojos.complexBodies.Conditions;
import selfPractise_APIPojos.complexBodies.Entity;
import selfPractise_APIPojos.complexBodies.MainRequest;

public class MainRequestSerialise {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// File Class
		File f = new File(".\\src\\test\\resources\\Untitled.json");
		// 1.Entity
		Entity ent = new Entity(3, "James");
		// Conditions Array
		Conditions c1 = new Conditions("equalTo", "department", "String", "abc");
		Conditions c2 = new Conditions("NotequalTo", "id", "number", "100");
		Conditions c3 = new Conditions("NotequalTo", "name", "Strubg", "jack");
		Conditions c4 = new Conditions("equalTo", "endDate", "20180502", "20180519");

		Conditions cond[] = { c1, c2, c3, c4 };

		MainRequest pojo = new MainRequest(ent, "OR", cond);

		ObjectMapper obm = new ObjectMapper();
		obm.writerWithDefaultPrettyPrinter().writeValue(f, pojo);
		System.out.println("Done");

		/* No serializer found for class selfPractise_APIPojos.complexBodies.MainRequest
		 and no properties discovered to create BeanSerializer (to avoid exception,
		 disable SerializationFeature.FAIL_ON_EMPTY_BEANS)--Occured if getters 
		 and setters are not provided in MainRequest Class
		*/
	}

}
