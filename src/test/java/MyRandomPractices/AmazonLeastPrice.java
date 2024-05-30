package MyRandomPractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonLeastPrice {
	public static void main(String[] args) throws InterruptedException {

		Logger log = Logger.getLogger(AmazonLeastPrice.class);
		WebDriver driver = new ChromeDriver();
		log.debug("Chrome Launched");
		driver.manage().window().maximize();
		log.debug("maximised");
		driver.get("https://www.amazon.in/");
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		RemoteWebDriver rw=(RemoteWebDriver) driver;
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		search.sendKeys("iphone");
		Thread.sleep(2000);
		// Way 1 to clear
		// js.executeScript("arguments[0].value='';", search);

		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement pagination = driver.findElement(
				By.xpath("//span[@class='s-pagination-item s-pagination-previous s-pagination-disabled ']"));
		Actions a = new Actions(driver);
		int y = pagination.getLocation().getY();
		System.out.println("y pixel= " + y);

		for (int i = 0; i < y; i++) {
			a.scrollByAmount(0, 500).perform();
			i = i + 500;
		}

		List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("size is " + allPrice.size());
		List<Integer> al = new ArrayList<Integer>();
		for (WebElement price : allPrice) {
			String stringPrice = price.getText();
			String temp = stringPrice.replaceAll(",", "");
			int amount = Integer.parseInt(temp);
			al.add(amount);
		}
		Collections.sort(al);
		for (int b : al) {
			System.out.println(b);

		}
		System.out.println("Minimum value-->" + al.get(0));
		rw.executeScript("window.scrollTo(0,-10000)");
		Thread.sleep(5000);
		driver.quit();

	}

}
