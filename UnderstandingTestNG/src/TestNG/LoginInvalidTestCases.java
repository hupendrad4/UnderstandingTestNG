package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginInvalidTestCases 
{

	@BeforeClass
	public void Start()
	{
		
		System.out.println("Chrome browser started");
		System.out.println("Application opened");
		//After opening app,dashboard opens up
	}	
	
	@BeforeMethod
	public void GoToLoginPage()
	{
		
		System.out.println("Clikibng on Login hyperlink on Dashboardd to got on LoginnPage");
	}
	
	@AfterMethod
	public void ClearBrowserCache()
	{
		System.out.println("CLEAR BROWSER CACHE after every testcase");
		
	}
	@Test(priority=1)
	public void TestCase1()
	{
		System.out.println("Enter InValid UserName");
		System.out.println("Enter InValid Password");
		System.out.println("Click on Login button");
		System.out.println("Check title of page opened to confirm that user has not reached inside app");
		
	}
	
	@Test(priority=2)
	public void TestCase2()
	{
		System.out.println("Keep UserName field blank");
		System.out.println("Enter Valid Password");
		System.out.println("Click on Login button");
		System.out.println("Check Error message to confirm that user has not reached inside app");
		
	}

	@Test(priority=3)
	public void TestCase3()
	{
		System.out.println("Enter valid data in UserName");
		System.out.println("Keep Password field blank");
		System.out.println("Click on Login button");
		System.out.println("Check Error message to confirm that user has not reached inside app");
		
	}
	@AfterClass
	public void Stop()
	{
		System.out.println("Quit Driver");
		
	}

	@BeforeTest
	public void CreateLoginTestData()
	{
		
		System.out.println("Creating Login Test data in Database");
	}

}
