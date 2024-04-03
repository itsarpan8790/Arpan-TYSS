package selfPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BigBasket1 {
	@Test
	public void bigBasket() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bigbasket.com/");

		// Actions Class Object
		Actions act = new Actions(driver);
		// Shop by Category
		WebElement shopByCat = driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']"));
		shopByCat.click();
		// 1st UL
		List<WebElement> bg_darkonyx = driver.findElements(By.xpath(
				"//button[@id='headlessui-menu-button-:R5bab6:']/following-sibling::div/descendant::ul[contains(@class,'bg-darkOnyx-800')]/descendant::a"));

		for (WebElement ele1 : bg_darkonyx) {
			act.moveToElement(ele1).perform();
			System.out.println(ele1.getText()+" items are ");
			System.out.println("******");
			List<WebElement> bg_silverSurfer = driver.findElements(By.xpath(
					"//button[@id='headlessui-menu-button-:R5bab6:']/following-sibling::div/descendant::ul[contains(@class,'bg-silverSurfer-200')]/descendant::a"));
                    for(WebElement ele2:bg_silverSurfer) {
                    	act.moveToElement(ele2).perform();
                    	System.out.println(ele2.getText()+"items are");
                    	List<WebElement> bg_white = driver.findElements(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']/following-sibling::div/descendant::ul[contains(@class,'bg-white')]/descendant::a"));
                    	for(WebElement ele3:bg_white) {
                    		act.moveToElement(ele3).perform();
                    		System.out.println(ele3.getText());
                    	}
                    
                    }
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
