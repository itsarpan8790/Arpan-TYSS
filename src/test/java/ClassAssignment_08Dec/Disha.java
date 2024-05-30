package ClassAssignment_08Dec;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Disha {
	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.mainworksstudio.com/");

		List<WebElement> allDots = driver.findElements(By.xpath("// ol[@class='flickity-page-dots']/li"));
		for (WebElement dot : allDots) {
			System.out.println(dot.getLocation().getX() + "," + dot.getLocation().getY());
			System.out.println();
		}

		WebElement firstDot = driver.findElement(By.xpath("//li[@aria-label='Page dot 1']"));

		Actions act = new Actions(driver);

		for (WebElement dot : allDots) {
			act.click(dot).perform();
			Thread.sleep(200);
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
