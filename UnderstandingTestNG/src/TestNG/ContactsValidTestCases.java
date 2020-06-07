package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class ContactsValidTestCases
{

@BeforeClass
	public void Start()
	{
		
		System.out.println("Chrome browser started");
		System.out.println("Application opened");
		//After opening app,dashboard opens up
		System.out.println("Go to LoginPage from Dashboard");
		System.out.println("Enter valid credentials and Login");
	}	
	
	@BeforeMethod
	public void GoToContactsPage()
	{
		
		System.out.println("Clikibng on Contact hyperlink on Dashboardd to got on ContactsPage");
	}
	
	@Test
	public void TestCase1()
	{
		System.out.println("Enter Valid FirstName");
		System.out.println("Enter Valid LastName");
		System.out.println("Click on Submit button");
		System.out.println("Check CORRECT DATA is saved");
		
	}
	
	@AfterClass
	public void Stop()
	{
		System.out.println("Quit Driver");
		
		
	}
}
