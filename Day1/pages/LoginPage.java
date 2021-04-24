package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecifiMethods;

public class LoginPage extends ProjectSpecifiMethods {

	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage enterUsername(String username) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password); 
		return this;
	}
	
	public Homepage clickLoginbutton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Homepage(driver);
	}
	
}
