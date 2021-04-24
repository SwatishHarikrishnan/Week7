package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifiMethods;
import pages.CreateLeadPage;
import pages.LoginPage;

public class CreateLeadcase extends ProjectSpecifiMethods {

	@BeforeTest
	public void setexcelfilename()
	{
		filename="Createlead";
	}
	
	@Test(dataProvider = "senddata")
	public void createlead(String username, String password, String companyname, String firstname, String Lastname) throws InterruptedException
	{
		new LoginPage(driver).enterUsername(username)
		.enterPassword(password).
		clickLoginbutton().
		clickHomepagebutton().
		createLead().
		companyname(companyname).
		firstName(firstname).
		lastName(Lastname).clickSubmitCreateLead().createdleadornot();
	}
}
