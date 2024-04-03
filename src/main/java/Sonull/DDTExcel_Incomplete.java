package Sonull;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DDTExcel_Incomplete {

	@Test
	public void main() throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.nseindia.com/market-data/live-equity-market?symbol=NIFTY%2050");

		// for scrolling down the table
		Actions a = new Actions(driver);
		WebElement scrollToNote = driver
				.findElement(By.xpath("//div[@id='marketWatchEquityCmsNote']/descendant::span[contains(.,'Note')]"));
		a.scrollToElement(scrollToNote).perform();

		// company names
		// table[@id='equityStockTable']/tbody/tr[@class='freezed-row']/following-sibling::tr/td[1]/a
		List<WebElement> companyNames = driver
				.findElements(By.xpath("//table[@id='equityStockTable']/descendant::a[@class='symbol-word-break']"));

		// high values
		List<WebElement> highVals = driver
				.findElements(By.xpath("//a[@class='symbol-word-break']/../../descendant::td[3]"));
		// getting the physical file
		FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\abcd.xlsx");
		// Creating the Workbook
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println("Sizes-" + companyNames.size() + " " + highVals.size());
		int count = 0;
		for (int i = 0; i < companyNames.size(); i++) {

			String company = companyNames.get(i).getText();
			wb.getSheet("Sheet1").getRow(i).getCell(0).setCellValue(company);

			String vals = highVals.get(i).getText();
			wb.getSheet("Sheet1").getRow(i).getCell(1).setCellValue(vals);

			System.out.println(company + "-" + vals);

			// getting the physical file toh java represantaion object
			FileOutputStream fos = new FileOutputStream(".\\src\\main\\resources\\abcd.xlsx");
			wb.write(fos);
			count++;
			System.out.println(count);
		}

		driver.quit();
	}
}
