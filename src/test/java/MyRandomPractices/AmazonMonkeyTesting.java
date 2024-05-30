package MyRandomPractices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMonkeyTesting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		List<WebElement> allLinks = driver
				.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']/descendant::a"));

		for (int i = 0; i < allLinks.size(); i++) {

			int random = (int) Math.floor(Math.random() * allLinks.size());
			System.out.println(random);

			allLinks.get(random).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			Thread.sleep(2000);

			// allLinks
			// =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='navFooterVerticalRownavAccessibility']/descendant::a")));
			
			allLinks = driver
					.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']/descendant::a"));
			/**
			 * Since page will return to home page-- thus "allLinks" address will become
			 * stale-- so driver has to find all links once again
			 */
		}
		driver.quit();

	}

}
