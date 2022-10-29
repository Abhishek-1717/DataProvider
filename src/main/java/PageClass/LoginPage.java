package PageClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	@Test(dataProvider ="credential")
	public void demo(String id,String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
        WebElement  email=driver.findElement(By.id("modalusername"));
        email.sendKeys(id);
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys(pass);
		
	}


	@DataProvider(name="credential")
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
			
		data[0][0]="Admin";	
		data[0][1]="admin123";
		data[1][0]="admin";
		data[1][1]="admin234";
		
		
		return data;
		
	}
}
