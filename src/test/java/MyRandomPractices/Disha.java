package MyRandomPractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Disha {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			String expText = "Policy Denied";
			String actText = null;
			boolean flag=false;
			int retry = 1;
			while (retry <= 3000) {
				try {
					WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
					actText = popup.getText();
					break;
				}
				catch (NoSuchElementException e) {
					retry++;
					if (retry > 3000) {
			         Reporter.log("Failed", true);
						break;
					}
				}
			}
			
			if(actText.contains(expText)) {
				flag=true;
			}
			Assert.assertTrue(flag);
			Reporter.log("Passed",true);
		}
	}


