package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactsInValidTestCases 
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
	
	@Test(priority=1)
	public void TestCase1()
	{
		System.out.println("Enter InValid FirstName");
		System.out.println("Enter InValid LastName");
		System.out.println("Click on Submit button");
		System.out.println("Check Error message shown by Contacts Modue");
		
	}
	
	@Test(priority=2)
	public void TestCase2()
	{
		System.out.println("Keep FirstName field blank");
		System.out.println("Keep LastName field blank");
		System.out.println("Click on Submit button");
		System.out.println("Check Error message shown by Contacts Modue");
		
	}
	
	@AfterClass
	public void Stop()
	{
		System.out.println("Quit Driver");
		
		
	}

	@BeforeTest
	public void CreateContactsData()
	{
		System.out.println("Creating Contacts Test data");
	}
	
	@AfterTest
	public void DeletingContactsTestData()
	{
		System.out.println("Deleting Contacts Test data");
	}
}
