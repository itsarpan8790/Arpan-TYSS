package sonuuuuuuuulREST;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoLibrarySonuul.Q2_Details;
import PojoLibrarySonuul.Q2_Student;

public class Q2_StudentReq {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		File file = new File(".\\src\\test\\resources\\student.json");

		Q2_Details p1 = new Q2_Details("Alice", 20);
		Q2_Details p2 = new Q2_Details("Bob", 22);
		Q2_Details p3 = new Q2_Details("Carol", 21);

		Q2_Details ar[] = { p1, p2, p3 };

		Q2_Student pojo = new Q2_Student(ar);

		ObjectMapper obm = new ObjectMapper();
		obm.writerWithDefaultPrettyPrinter().writeValue(file, pojo);

	}

}
