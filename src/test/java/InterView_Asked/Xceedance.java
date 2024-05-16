package InterView_Asked;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Xceedance {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(3000);
		
		
		WebElement departure = driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']"));
		Thread.sleep(3000);
		departure.click();
		
		String DAY="Mon";
		for(int i=14;;i++) {
			
			try {
				String path="//div[@class='DayPicker-Day DayPicker-Day--selected']/ancestor::div[@class='DayPicker-Month']/descendant::div[contains(@aria-label,'"+DAY+" ') and contains(@aria-label,'"+i+"')]";
				driver.findElement(By.xpath(path)).click();
				
			    System.out.println("try-->"+i+" clicked");
				break;
			} catch (Exception e) {
				System.out.println("catch-->"+i);
			}
		}
		
		
		
				
	}
	
	
	

}
