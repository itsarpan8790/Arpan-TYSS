package InterView_Asked;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SureMindsSolutions {

	@Test(priority = 1)
	public void maxLengthWord() {
		String s = "I love book reading";
		String ar[] = s.split(" ");

		int max = ar[0].length();
		String value = ar[0];
		for (int i = 0; i < ar.length; i++) {

			if (ar[i].length() > max) {
				max = ar[i].length();
				value = ar[i];
			}
		}

	}

	@Test
	public void maxLengthWordRepeated() {
		String s = "I love book writing reading";
		String ar[] = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int max = ar[0].length();

		for (int i = 0; i < ar.length; i++) {
			if (ar[i].length() > max) {
				max = ar[i].length();
			}
			hm.put(ar[i], ar[i].length());
		}

		for (Entry<String, Integer> h : hm.entrySet()) {
			if (h.getValue() == max)
				System.out.println(h.getKey() + " " + h.getValue());
		}

	}

	@Test(priority = 2)
	public void countEachWord() {
		String s = "I love book reading";
		String ar[] = s.split(" ");

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " length is " + ar[i].length());

		}
	}

	@Test(priority = 3)
	public void stateCity() {
		ArrayList<String> al = new ArrayList<String>();

		al.add("city 1 State1");
		al.add("city 2 State2");
		al.add("city 3 State1");
		al.add("city 4 State3");

		for (String a : al) {
			if (a.contains("State1")) {
				System.out.println(a);
			}
		}

	}

	@Test
	public void AlertWithoutGetText() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	

		if (alert != null) {
			System.out.println(alert.getText());
		}

//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		Object text=js.executeScript("return arguments[0].textContent", alert1);
//		String s= (String) text;
//		System.out.println(s);

		driver.quit();
	}

	@Test
	public static void stringProblem() {
		String s = "Sapient India Bruhat Bangalore";
		// Output S@pient Indi@@ Bruh@@@t B@@@@ng@@@@@lore

		String temp = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a') {
				count++;
				for (int j = 1; j <= count; j++) {
					temp = temp + '@';

				}
			}

			else

				temp = temp + s.charAt(i);
		}
		System.out.println(temp);
	}

}
