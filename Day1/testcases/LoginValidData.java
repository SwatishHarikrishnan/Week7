package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifiMethods;
import pages.LoginPage;

public class LoginValidData extends ProjectSpecifiMethods {

	@BeforeTest
	public void setexcelfilename()
	{
		filename="Login";
	}
	
	@Test(dataProvider ="senddata")
	public void login(String username, String password) throws InterruptedException
	{
		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLoginbutton();
	}
	
}
