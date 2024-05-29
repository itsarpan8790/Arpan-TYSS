package myrandomPractises;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_MS {
	
	@FindBy(xpath="//input[@name='passwd']")
	private WebElement pwdTxtFld;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	
	public  Pom_MS(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPwdTxtFld() {
		return pwdTxtFld;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
