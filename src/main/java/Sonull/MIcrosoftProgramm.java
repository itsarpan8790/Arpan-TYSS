package Sonull;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MIcrosoftProgramm {

	@Test
	public void main() throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.microsoft.com/en-in/");

		// parent window Title
		String pTitle = driver.getTitle();

		// scroll To "Windows 11 for business"
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int Y = driver.findElement(By.xpath("//h3[contains(.,'Windows 11 for business')]")).getLocation().getY();
		js.executeScript("window.scrollBy(0," + Y + ")");

		// Clicking on learnMoreUrl
		WebElement target = driver.findElement(By.xpath(
				"//h3[contains(.,'Windows 11 for business')]/parent::div[@class='card-body  pt-3']/following-sibling::div/div/a[contains(.,'Learn more')]"));
		Actions a = new Actions(driver);
		a.contextClick(target).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);

		// all window Ids
		Set<String> allWid = driver.getWindowHandles();

		String acttitle = null;
		for (String wid : allWid) {
			acttitle = driver.switchTo().window(wid).getTitle();
			if (!acttitle.equals(pTitle))
				break;
		}
		String expectedTitle = "Windows for Business | Microsoft";

		// System.out.println(expectedTitle);

		Assert.assertEquals(acttitle, expectedTitle);
		driver.quit();
	}
}
