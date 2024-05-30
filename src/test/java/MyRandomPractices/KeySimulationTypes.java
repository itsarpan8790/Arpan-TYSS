package MyRandomPractices;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeySimulationTypes {
	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_F5);
		
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.sendKeys("a");
		a.sendKeys(Keys.F12);
		driver.findElement(null).sendKeys(Keys.CONTROL);
		
	}

}
