package practiseAllSDET52;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusScenario {
	public static void main(String[] args) throws Throwable {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		// opt.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(opt);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");

		WebElement to = driver.findElement(By.id("src"));
		to.sendKeys("Banglore");
		Thread.sleep(1000);
		to.sendKeys(Keys.ENTER);
		WebElement from = driver.findElement(By.id("dest"));
		from.sendKeys("Mangaluru");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(from)).sendKeys(Keys.ENTER);
		// div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR' and contains(.,'May')
		// and contains(.,'2024')]/descendant::span[text()='23']
		driver.findElement(By.xpath(
				"//div[text()='May']/ancestor::div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']/descendant::span[text()='23']"))
				.click();
		driver.findElement(By.id("search_button")).click();
		try {
			WebElement x = driver.findElement(By.xpath("//div[@class='close-primo']"));
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(x)).click();
		} catch (Exception e) {

		}

		WebElement aboutUs = driver.findElement(By.xpath("//a[@id='about_us_footer']"));
		int y=aboutUs.getLocation().getY();
		System.out.println("location at >"+y);
		for(int i=0;i<=y;i++) {
			js.executeScript("window.scrollBy(0,"+i+")");
			System.out.println(i);
		}
		System.out.println("Printing");
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='f-19 f-bold']"));
		for (WebElement price : allPrices) {
			System.out.println(price.getText());
		}
		
//		int ifcount = 0;
//		int elsecount = 0;
//		for (;;) {
//			if (aboutUs.isDisplayed()) {
//				ifcount++;
//				System.out.println(ifcount);
//				List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='f-19 f-bold']"));
//				for (WebElement price : allPrices) {
//					System.out.println(price.getText());
//				}
//				break;
//			} else {
//				elsecount++;
//				System.out.println(elsecount);
//				js.executeScript("windows.scrollBy(0,1000)", args);
//			}
//		}

		System.out.println("end");
		

	}
}
