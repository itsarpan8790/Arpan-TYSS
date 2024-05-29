package myrandomPractises;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CheckPageLoadedTest {
	@Test
	public void checkPageLoad() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings#mens-team-rankings");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object state = js.executeScript("return document.readyState");
		System.out.println(state);
	}

}
