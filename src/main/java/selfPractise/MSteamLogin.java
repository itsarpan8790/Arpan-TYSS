package selfPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MSteamLogin {
	@Test
	public void login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://teams.live.com/");

		// Enter Email
		WebElement emailTxtFld = driver.findElement(By.name("loginfmt"));
		emailTxtFld.sendKeys("arpank6@hotmail.com");
		driver.findElement(By.id("idSIButton9")).click();
		 Thread.sleep(2000);
		// Enter Password
		 Pom_MS pm=new Pom_MS(driver) ;
		 pm.getPwdTxtFld().sendKeys("Truba@101017");
		 Thread.sleep(2000);
		 pm.getSubmit().click();
		 
			
			
	}

}
