package SelfPractise_ApiTestscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.aventstack.extentreports.util.Assert;
import com.mysql.cj.jdbc.Driver;

public class LearnJdbc {
	public static void main(String[] args) throws SQLException {
		// 2.Get connection
		Connection conn = null;
		try {
			// 1.Register Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet52", "root", "tiger");
			// 3.Create Statement
			Statement state = conn.createStatement();
			// 4.Execute Query
			String query1 = "select * from jdbc";
			String query2 = "insert into jdbc values('chandu','1234567890','30')";
			int result2 = state.executeUpdate(query2);// NON DQL commands
			if (result2 >= 1) {
				System.out.println("Data inserted Succesfully");
				System.out.println(result2 + "Rows affected");

				ResultSet result = state.executeQuery(query1);// DQL commands
				while (result.next()) {
					System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(2));

				}
			}

		} catch (SQLException e) {
			// 5.Close Connection
			conn.close();
			e.printStackTrace();
		}

	}

	public void trick() {
		WebDriver driver = new ChromeDriver();
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		String expText = "Policy Denied";
		String actText = null;
		int retry = 1;
		while (retry <= 3000) {
			try {
				WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
				actText = popup.getText();
				break;
			}

			catch (NoSuchElementException e) {
				retry++;
				if (retry > 3000) {
					Reporter.log("Failed", true);
					break;
				}
			}
		}
		boolean flag=false;
		if(actText.contains(expText))
			flag=true;
		org.testng.Assert.assertTrue(flag);
		Reporter.log("Passed", true);
	}

}
