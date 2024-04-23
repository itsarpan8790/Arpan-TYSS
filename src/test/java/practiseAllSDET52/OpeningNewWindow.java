package practiseAllSDET52;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningNewWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.interviewbit.com/selenium-interview-questions-for-5-years-experience/#selenium-script-runs-in-chrome-but-not-in-ie-what-can-be-done");
		driver.switchTo().newWindow(WindowType.WINDOW.TAB);
		driver.get(
				"https://www.google.com/search?q=define+debugging&oq=define+debu&gs_lcrp=EgZjaHJvbWUqBwgAEAAYgAQyBwgAEAAYgAQyBwgBEAAYgAQyBwgCEAAYgAQyBggDEEUYOTIHCAQQABiABDIHCAUQABiABDIHCAYQABiABDIHCAcQABiABDIHCAgQABiABDIHCAkQABiABKgCALACAQ&sourceid=chrome&ie=UTF-8");
	}

}
