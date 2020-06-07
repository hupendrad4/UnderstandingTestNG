package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginValidTestcases 
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
	
	@Test
	public void TestCase1()
	{
		System.out.println("Enter Valid UserName");
		System.out.println("Enter Valid Password");
		System.out.println("Click on Login button");
		System.out.println("Check title of Welcome page");
		
	}
	
	@AfterClass
	public void Stop()
	{
		System.out.println("Quit Driver");
		
		
	}

	@AfterTest
	public void CreateLoginTestData()
	{
		
		System.out.println("Deleting Login Test data from Database");
	}


	@BeforeSuite
	public void CreateResultFolder()
	{
		System.out.println("Create a folder to save execution result");
	}


	@AfterSuite
	public void CopyResultFile()
	{
		
		System.out.println("Copy created result file in folder at the end");
	}
}
