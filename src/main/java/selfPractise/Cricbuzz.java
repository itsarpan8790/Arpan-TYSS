package selfPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	public class Cricbuzz {
		
		@Test
		public void main() {
			
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.cricbuzz.com/live-cricket-scorecard/86728/indu19-vs-ausu19-final-icc-under-19-world-cup-2024");
			
			
			WebElement runsOfHS = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/child::div[text()='55']"));		//Runs of Harjas Singh
			WebElement srOfTS = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/child::div[text()='61.54']"));		//SR of Tom Straker
			WebElement dnb = driver.findElement(By.xpath("//div[@class='cb-col-73 cb-col']"));		//did not bat
			
			System.out.println("Runs of Harjas Singh is " + runsOfHS.getText());
			System.out.println("Strike Rate of Tom Straker is " + srOfTS.getText());
			System.out.println(dnb.getText());
			
			driver.quit();

}}
