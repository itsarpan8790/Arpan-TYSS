package myrandomPractises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BookingcomAutomateTest {
	@Test
	public void testcase1() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.booking.com/");

		driver.findElement(
				By.xpath("//span[text()='Sign in or register']/../../../../descendant::span[@class='eedba9e88a']"))
				.click();
		driver.findElement(By.xpath("//input[@name='ss']")).sendKeys("patna");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='Karnataka, India']/preceding-sibling::div[contains(.,'Bangalore')]"))
				 driver.findElement(By.xpath("//div[text()='Bihar, India']/preceding-sibling::div[contains(.,'Patna')]"))
				.click();
		driver.switchTo().activeElement();
		driver.findElement(
				By.xpath("//h3[text()='April']/ancestor::div[@class='d358556c65']/descendant::span[text()='29']"))
				.click();
		driver.findElement(
				By.xpath("//h3[text()='April']/ancestor::div[@class='d358556c65']/descendant::span[text()='30']"))
				.click();
		driver.findElement(By.xpath("//span[@data-testid='searchbox-form-button-icon']")).click();
		driver.findElement(By.xpath("//label[text()='Rooms']/../../descendant::button[contains(@class,'f4d78af12a')]"))
				.click();
		driver.findElement(By.xpath("//span[@class='e4adce92df' and text()='Search']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// total searches
		String totalSearches = driver.findElement(By.xpath("//h1[@class='f6431b446c d5f78961c3']")).getText();
		String temp = "";
		for (int i = 0; i < totalSearches.length(); i++) {
			if (totalSearches.charAt(i) >= '0' && totalSearches.charAt(i) <= '9') {
				temp = temp + totalSearches.charAt(i);
			}
		}
		int searches = Integer.parseInt(temp);
		System.out.println(temp);
		int count = 0;
		for (;;) {
			Thread.sleep(2000);
			List<WebElement> allPriceEle = driver
					.findElements(By.xpath("//span[@class='f6431b446c fbfd7c1165 e84eb96b1f']"));
			System.out.println(allPriceEle.size());
			System.out.println(count++);
			if (allPriceEle.size() == searches) {

				for (WebElement priceEle : allPriceEle) {
					System.out.println(priceEle.getText());
				}
				break;

			} else {

				try {
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					WebElement load = driver.findElement(By.xpath("//span[text()='Load more results']"));
					load.click();
					
				} catch (Exception e) {
					continue;
				}

			}
			

		}
	}

}
