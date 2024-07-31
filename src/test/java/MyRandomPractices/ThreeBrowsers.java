package MyRandomPractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ThreeBrowsers {
	WebDriver driver;
	@Test
	public  void main() {
		
		driver=new ChromeDriver();
		driver=new FirefoxDriver();
		driver=new EdgeDriver();
		
		driver.get("https://www.irctc.co.in/");
		
	}

}
