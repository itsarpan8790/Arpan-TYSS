package PrakashSirSpecific;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToChangeDownLoadPath {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("download.default_directory", "C:\\Users\\SanjayBabu\\Desktop\\newFolder");
		
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);
	}

}
