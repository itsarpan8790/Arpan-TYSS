package selfPractise;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender_CurrentDate {
	@Test
	public void sysDateCapture() {
		Date d = new Date();
		String currentDate = d.toString();
		System.out.println(currentDate);// Sun Mar 03 22 : 14 : 04 IST 2024

		// Spliting Date into Array --"Sun" "Mar" "03" "22:14:04" "IST" "2024"
		String[] dateArray = currentDate.split(" ");

		// Capturing Sysdate
		int dd = Integer.parseInt(dateArray[2]);
		System.out.println("Date is--" + dd);
		// Capturing SysMonth
		String month = dateArray[1];// Mar
		System.out.println("Month is-- " + month);

		// Launching Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/arpan/Desktop/adarsh/ad.html");

		// Locating Date on App
		WebElement sysDate = driver.findElement(By.xpath("//div[@id='mui-107-grid-label' and contains(.,'" + month
				+ "')]/ancestor::div[@class='MuiCalendarPicker-root mui-169iwlq-MuiCalendarPicker-root']/descendant::button[text()='"
				+ dd + "']"));
		// Clickiung CurrentDate
		sysDate.click();

		// Printing datte Captured
		System.out.println(sysDate.getText());
		
		System.out.println(dd==Integer.parseInt(sysDate.getText()));
	}

}
